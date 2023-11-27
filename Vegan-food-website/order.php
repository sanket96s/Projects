<?php

if ($_SERVER["REQUEST_METHOD"] == "POST") {

    $username = $_POST["username"];
    $orderedItemNames = json_decode($_POST['orderedItems'], true);
    $totalAmount = $_POST["totalAmount"];

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

    // Concatenate ordered item names into a single string
    $allOrderedItems = implode(', ', $orderedItemNames);

    // sql query to insert data
    $sql = "INSERT INTO `transactions` (`username`, `ordered_item`, `bill`) VALUES ('$username', '$allOrderedItems', '$totalAmount')";


    if ($conn->query($sql) === TRUE) {

        header("Location: thank_you.html");
    } else {
        echo "Error: " . $sql . "<br>" . $conn->error;
    }

    // Close the connection
    $conn->close();

} else {
    echo "Invalid request method";
}
?>