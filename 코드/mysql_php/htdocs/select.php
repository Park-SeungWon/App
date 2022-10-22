<?php

error_reporting(E_ALL);
ini_set('display_errors', 1);

include('dbcon.php');

/* DB 연결 확인 */
if ($con) {
    echo "Connection established" . "<br>";
} else {
    die('Could not connect: ' . mysqli_error($conn));
}


/* SELECT 예제 */
$sql = "SELECT * FROM user";
$result = mysqli_query($con, $sql);
while ($row = mysqli_fetch_array($result)) {
    echo $row['user_id'] . " " . $row['password'] . "<br>";
}

mysqli_close($con);
