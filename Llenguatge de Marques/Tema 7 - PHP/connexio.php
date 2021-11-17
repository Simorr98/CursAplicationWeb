<?php

$db_host = 'localhost';
$db_user = 'usuari';
$db_password = '1234';
$db_db = 'proves';

$connexio = new mysqli(
    $db_host,
    $db_user,
    $db_password,
    $db_db
);

if ($connexio->connect_error) {
    echo 'Errno: '.$connexio->connect_errno;
    echo '<br>';
    echo 'Error: '.$connexio->connect_error;
    exit();
}
