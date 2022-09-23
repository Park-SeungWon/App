<?php
// Setting up connection with database Geeks
$connection = mysqli_connect(
    "localhost",
    "root",
    "^admin!",
    "pingu"
);

// Check connection
if (mysqli_connect_errno()) {
    echo "Database connection failed.";
}

// query to fetch Username and Password from
// the table geek
$query = "SELECT * FROM user";

// Execute the query and store the result set
$result = mysqli_query($connection, $query);

if ($result) {
    // it return number of rows in the table.
    // $row = mysqli_num_rows($result);

    // if ($row) {
    //     printf("Number of row in the table : " . $row);
    // }
    // // close the result.
    // mysqli_free_result($result);
    $data = array();

    while ($row = mysqli_fetch_array($result)) {
        echo $row['user_id'] . " " . $row['password'] . "<br>";

        extract($row);
        array_push(
            $data,
            array(
                'user_id' => $user_id,
                'password' => $password,
                'authority_level' => $authority_level
            )
        );
    }

    header('Content-Type: application/json; charset=utf8');
    $json = json_encode(array("user" => $data), JSON_PRETTY_PRINT + JSON_UNESCAPED_UNICODE);
    echo $json;
} else {
    echo "Error : query error";
}
// Connection close 
mysqli_close($connection);
