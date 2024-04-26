<?php
$servername="localhost";
$username="root";
$password="realfact";
$dbname="enrollment";
$conn=new mysqli($servername,$username,$password,$dbname);
if($conn->connect_error){
	die("Connection Failed" . $conn->connect_error);
}
$programming_Language_Preference=$_POST["programming_Language_Preference"];
$Highest_Degree_Earned=$_POST["Highest_Degree_Earned"];
$I_am_a=$_POST["I_am_a"];
$Institute_Name=$_POST["Institute_Name"];
$Graduation_Year=$_POST["Graduation_Year"];
$sql="INSERT INTO professional_information(programming_Language_Preference,Highest_Degree_Earned,I_am_a,Institute_Name,Graduation_Year) 
VALUES('$programming_Language_Preference','$Highest_Degree_Earned','$I_am_a','$Institute_Name',$Graduation_Year)";
$conn->query($sql);
include 'contact details.html';
$conn->close();
?>
