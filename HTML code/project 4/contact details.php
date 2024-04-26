<html>
<title>Programming Languages</title>
<link rel="stylesheet" href="contact details.css">
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
<h2>6/6 Contact Informations</h2>
<form action="contact details.php" method="post">
<h5 class="nam">* Email address:<br>
<input type="email" placeholder="Email address" name="Email address" id="Email" required="@' '.com">
</h5>
<h5 class="name">* Your City Name:<br>
<input type="text" placeholder="City Name" name="City" required>
</h5>
<h5>* Your Address:<br>
<textarea rows="7" cols="40" placeholder="Your Address" name="Address" value="address" required></textarea></h5>
<p>Note:-Please Enter your address limited to 150 characters</p>
<h5 class="number">* Area Pincode:<br>
<input type="number" placeholder="Area Pincode" name="Area Pincode" maxlength="6" value="pincode" required>
</h5>
<h5 class="phone">* Contact/Mobile Number:<br>
<input type="phone" placeholder="Mobile Number" name="Mobile Number" maxlength="10" required>
</h5>
<p>Note:-Please Enter your phone number without your country code & leading 0</p><br>
<table align="center" class="level">
<tr>
<th><input type="submit" name="next" value="Next >"></th>
</tr>
</table>
</form>
</body>
</html>