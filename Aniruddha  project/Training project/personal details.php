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
<link rel="stylesheet" href="personal details.css">
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
<h2>4/6 Personal Information</h2>
<form action="personal details.php" method="post">
<h5 class="name">* User Name:<br>
<input type="text" placeholder="User Name" name="User name" id="User Name" required>
</h5>
<h5 class="name">* Password:<br>
<input type="password" placeholder="Password" name="Password" id="Password" required>
</h5>
<h5 class="name">* Confirm Password:<br>
<input type="Password" placeholder="Confirm Password" name="Confirm Password" id="Confirm Password" required>
</h5>
<h5 class="name">* Father Name:<br>
<input type="text" placeholder="Father Name" name="Father name" id="Father Name" required>
</h5>
<h5 class="name">* Mother Name:<br>
<input type="text" placeholder="Mother Name" name="Mother name" id="Mother Name" required>
</h5>
<h5 class="name">* Date of birth:<br>
<input type="date" name="Date of Birth" value="date" required>
</h5>
<h5>Gender:
<input type="radio" name="Gender" value="Male">Male
<input type="radio" name="Gender" value="Female">Female
<input type="radio" name="Gender" value="Other">Other</h5>
<h5 class="img">* Upload picture of yourself:<br>
<input type="file">
<input type="submit" value="Upload image">
</h5>
<p>Note:-Upload files of type jpeg,jpg,png only.Max size allowed is 1 MB.</p><br>
<table align="center" class="level">
<tr>
<th><input type="submit" name="next" value="Next >"></th>
</tr>
</table>
</form>
</body>
</html>