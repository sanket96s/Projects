<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $username = $_POST["username"];
    $password = $_POST["password"];
    $address = $_POST["address"];
    $phone = $_POST["phone"];
    $email = $_POST["email"];


    $servername = "localhost";
    $username_db = "root";
    $password_db = "";
    $dbname = "vegan_food";

    // Create connection
    $conn = new mysqli($servername, $username_db, $password_db, $dbname);

    // Check connection
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    // queries to insert data
    $sql = "INSERT INTO `register_data` (`username`, `password`, `address`, `phone`, `email`) VALUES ('$username', '$password', '$address', '$phone', '$email')";
    $sql1 = "INSERT INTO `login_data`(`username`, `password`) VALUES ('$username','$password')";

    if ($conn->query($sql) === TRUE and $conn->query($sql1) === TRUE) {
        header("Location: thank_you.html");
        exit();
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    $conn->close();
}
?>