<?php
$servername="localhost";
$username="root";
$password="realfact";
$dbname="enrollment";
$conn=new mysqli($servername,$username,$password,$dbname);
if($conn->connect_error){
	die("Connection Failed" . $conn->connect_error);
}
$Email_address=$_POST["Email_address"];
$City_Name=$_POST["City_Name"];
$Address=$_POST["Address"];
$Area_Pincode=$_POST["Area_Pincode"];
$Mobile_Number=$_POST["Mobile_Number"];
$sql="INSERT INTO professional_information(Email_address,City_Name,Address,Area_Pincode,Mobile_Number) 
VALUES('$Email_address','$City_Name','$Address',$Area_Pincode,$Mobile_Number)";
$conn->query($sql);
include 'review.html';
$conn->close();
?>