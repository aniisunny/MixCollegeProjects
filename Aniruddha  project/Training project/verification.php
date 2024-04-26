<?php
$servername="localhost";
$username="root";
$password="realfact";
$dbname="enrollment";
$conn=new mysqli($servername,$username,$password,$dbname);
if($conn->connect_error){
	die("Connection Failed" . $conn->connect_error);
}
$Government_Photo_ID=$_POST["Government_Photo_ID"];
$Government_ID_Number=$_POST["Government_ID_Number"];
$Government_ID_Name=$_POST["Government_ID_Name"];
$sql="INSERT INTO verification(Government_Photo_ID,Government_ID_Number,Government_ID_Name) VALUES('$Government_Photo_ID',$Government_ID_Number,'$Government_ID_Name')";
$conn->query($sql);
include 'personal details.html';
$conn->close();
?>
