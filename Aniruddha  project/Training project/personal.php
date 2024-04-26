<?php
$servername="localhost";
$username="root";
$password="realfact";
$dbname="enrollment";
$conn=new mysqli($servername,$username,$password,$dbname);
if($conn->connect_error){
	die("Connection Failed" . $conn->connect_error);
}
$User_name=$_POST["User_name"];
$Password=$_POST["Password"];
$Confirm_Password=$_POST["Confirm_Password"];
$Father_Name=$_POST["Father_Name"];
$Mother_Name=$_POST["Mother_Name"];
$Date_of_Birth=$_POST["Date_of_Birth"];
$Gender=$_POST["Gender"];
if($Password!=$Confirm_Password){
	$message ="Password does not match";
    echo "<script type='text/javascript'>alert('$message')</script>";
	die();
}
$sql="INSERT INTO personal_information(User_name,Password,Father_Name,Mother_Name,Date_of_Birth,Gender) 
VALUES('$User_name','$Password','$Father_Name','$Mother_Name','$Date_of_Birth','$Gender')";
$conn->query($sql);
include 'professional details.html';
$conn->close();
?>