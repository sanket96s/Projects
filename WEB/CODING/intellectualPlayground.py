from flask import Flask, render_template, request, redirect, url_for
import mysql.connector
from flask_sqlalchemy import SQLAlchemy
from datetime import datetime
import os


app = Flask(__name__)

app.template_folder = './static/html'
app.static_folder = './static'


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/signup')
def signup():
    return render_template('signup.html')


def authenticate_user(username, password):
    try:
        connection = mysql.connector.connect(
            host='localhost',
            database='intellectual_playground',
            user='root',
            password='sanky25032003'
        )

        if connection.is_connected():
            cursor = connection.cursor(dictionary=True)
            query_username = "SELECT * FROM user WHERE username = %s"
            cursor.execute(query_username, (username,))
            user = cursor.fetchone()
            if user:
                if user['password'] == password:
                    return 'success'  # Authentication successful
                else:
                    return 'incorrect_password'  # Incorrect password
            else:
                return 'user_not_found'  # User not found
    except mysql.connector.Error as e:
        print("Error while connecting to MySQL", e)
        return 'db_error'  # Error occurred
    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()


@app.route('/login', methods=['POST'])
def login():
    if request.method == 'POST':
        username = request.form['username']
        password = request.form['password']
        auth_result = authenticate_user(username, password)
        if auth_result == 'success':
            return render_template('mainPage.html')
        elif auth_result == 'incorrect_password':
            return render_template('errorPassword.html')
        elif auth_result == 'user_not_found':
            return render_template('errorUsername.html')
        else:
            return render_template('errorDB.html')


# Configure the MySQL database
app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+mysqlconnector://root:sanky25032003@localhost/intellectual_playground'
app.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = False
app.config['UPLOAD_FOLDER'] = 'uploads'  # Folder to store uploaded files
db = SQLAlchemy(app)

# Define the User model


class User(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    fullname = db.Column(db.String(100), nullable=False)
    dob = db.Column(db.Date, nullable=False)
    email = db.Column(db.String(120), unique=True, nullable=False)
    gender = db.Column(db.String(10), nullable=False)
    username = db.Column(db.String(30), unique=True, nullable=False)
    password = db.Column(db.String(60), nullable=False)
    profile_photo = db.Column(db.String(100))  # Store file path in database

# Route to handle form submission


@app.route('/submit', methods=['POST'])
def submit_form():
    fullname = request.form['fullname']
    # Convert string date to Python date object
    dob = datetime.strptime(request.form['dob'], '%Y-%m-%d').date()
    email = request.form['email']
    gender = request.form['gender']
    username = request.form['username']
    password = request.form['password']

    # Handle file upload
    if 'profilephoto' in request.files:
        file = request.files['profilephoto']
        if file.filename != '':
            file_path = os.path.join(
                app.config['UPLOAD_FOLDER'], file.filename)
            file.save(file_path)
        else:
            file_path = None
    else:
        file_path = None

    # Create a new User instance
    new_user = User(fullname=fullname, dob=dob, email=email, gender=gender,
                    username=username, password=password, profile_photo=file_path)

    # Add the new user to the database session
    with app.app_context():
        db.session.add(new_user)
        db.session.commit()

    return redirect(url_for('success'))


@app.route('/success')
def success():
    return render_template('successRegister.html')


if __name__ == '__main__':
    app.run(debug=True)
