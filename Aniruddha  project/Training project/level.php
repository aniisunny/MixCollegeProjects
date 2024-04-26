<?php
$servername="localhost";
$username="root";
$password="realfact";
$dbname="enrollment";
$conn=new mysqli($servername,$username,$password,$dbname);
$level=$_POST["Level"];
if($level=="Foundation Level"){
$sql="UPDATE level SET level='$level' WHERE price LIKE '3500%' ";
}
else if($level=="Advanced Level"){
$sql="UPDATE level SET level='$level' WHERE price LIKE '4500%' ";
}
else if($level=="Foundation Level"){
$sql="UPDATE level SET level='$level' WHERE price LIKE '5500%' ";
}
$conn->query($sql);
include 'onsite details.html';
$conn->close();
?>
