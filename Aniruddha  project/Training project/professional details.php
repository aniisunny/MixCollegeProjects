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
<link rel="stylesheet" href="professional details.css">
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
<h2>5/6 Professional Information</h2>
<form action="professional details.php" method="post">
<h5>* Programming Language Preference:<br>
<select class="dat" name="Programming Language Prereference" value="PLP" required>
<option hidden>Programming Language Preference</option>
<option>C(gcc 6.3)</option>
<option>C++14(gcc 6.3)</option>
<option>Java(HotSpot 8u112)</option>
<option>Python(cpython 2.7.13)</option>
<option>Python3(Python 3.5)</option>
<option>PyPy(PyPy 2.6.0)</option>
<option>C#(gmcs 4.6.2)</option>
<option>Pascal(fpc 3.0.0)</option>
<option>Pascal(gpc 20070904)</option>
<option>Ruby(Ruby 2.3.3)</option>
<option>PHP(php 7.1.0)</option>
<option>Go(go 1.7.4)</option>
<option>JavaScript(node 7.4.0)</option>
<option>Haskell(ghc 8.0.1)</option>
<option>Rust(rust 1.14.0)</option>
</select>
</h5>
<h5 class="nam">* Highest Degree Earned:<br>
<input type="text" placeholder="Highest Degree Earned" name="Highest Degree Earned" id="HDE" required>
</h5>
<h5>* I am a:
<input type="radio" name="I am a" value="Student">Student
<input type="radio" name="I am a" value="Professional">Professional
<input type="radio" name="I am a" value="Other">Other</h5>
<h5 class="name">* Name of Institute:<br>
<input type="text" placeholder="Institute Name" name="Name of Institute" id="Institute Name" required>
</h5>
<h5>* Graduation Year:<br>
<select class="date" name="Graduation Year" value="GY" required>
<option hidden>Graduation Year</option>
<option>2018</option>
<option>2019</option>
<option>2020</option>
<option>2021</option>
<option>2022</option>
<option>2023</option>
<option>2024</option>
<option>2025</option>
</select>
</h5>
<table align="center" class="level">
<tr>
<th><input type="submit" name="next" value="Next >"></th>
</tr>
</table>
</form>
</body>
</html>