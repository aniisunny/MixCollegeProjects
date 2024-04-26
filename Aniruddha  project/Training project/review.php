<?php
$servername="localhost";
$username="root";
$password="realfact";
$dbname="enrollment";
$conn=new mysqli($servername,$username,$password,$dbname);
if($conn->connect_error){
	die("Connection Failed" . $conn->connect_error);
}
?>
<html>
<title>Programming Languages</title>
<link rel="stylesheet" href="review.css">
<body>
<h1>Enrollment for Certification</h1>
<ul>
<li><a href="level.html">1.Level</a></li>
<li><a href="onsite details.html">2.Onsite Details</a></li> 
<li><a href="verification.html">3.Verification</a></li>
<li><a href="personal details.html">4.Personal Details</a></li> 
<li><a href="professional details.html">5.Professional Details</a></li> 
<li><a href="contact details.html">6.Contact Details</a></li>
<li><a href="review.html">7.Review</a></li>
</ul>
<h2>REVIEW</h2>
</body>
</html>