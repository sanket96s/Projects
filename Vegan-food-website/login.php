<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Retrieve form data
    $username = $_POST["username"];
    $password = $_POST["password"];

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

    // sql query to check
    $sql = "SELECT * FROM `login_data` WHERE `username` = '$username'";

    $result = $conn->query($sql);

    if ($result->num_rows > 0) {

        // Username found, check password
        $row = $result->fetch_assoc();

        if ($row['password'] == $password) {

            // Valid username and password
            session_start();
            $_SESSION['username'] = $username;
            echo json_encode(["status" => "success"]);
            exit();
        } else {

            // Invalid password
            echo json_encode(["status" => "error", "errorType" => "password"]);
        }
    } else {

        // Invalid username
        echo json_encode(["status" => "error", "errorType" => "username"]);
    }

    // Close connection
    $conn->close();
}
?>