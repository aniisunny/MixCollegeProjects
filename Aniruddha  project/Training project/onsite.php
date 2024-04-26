<?php
$servername="localhost";
$username="root";
$password="realfact";
$dbname="enrollment";
$conn=new mysqli($servername,$username,$password,$dbname);
if($conn->connect_error){
	die("Connection Failed" . $conn->connect_error);
}
$Date=$_POST["Date"];
$city=$_POST["City"];
if($city=="Bengaluru"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Bengaluru' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Bengaluru' ";
}
else if($city=="Chennai"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Chennai' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Chennai' ";
}
else if($city=="Delhi"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Delhi' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Delhi' ";
}
else if($city=="Hyderabad"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Hyderabad' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Hyderabad' ";
}
else if($city=="Kolkata"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Kolkata' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Kolkata' ";
}
else if($city=="Mumbai"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Mumbai' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Mumbai' ";
}
else if($city=="Pune"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Pune' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Pune' ";
}
else if($city=="Kanpur"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Kanpur' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Kanpur' ";
}
else if($city=="Gandhinagar"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Gandhinagar' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Gandhinagar' ";
}
else if($city=="Mathura"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Mathura' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Mathura' ";
}
else if($city=="Bhubaneswar"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Bhubaneswar' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Bhubaneswar' ";
}
else if($city=="Jalandar"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Jalandar' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Jalandar' ";
}
else if($city=="Indore"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Indore' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Bengaluru' ";
}
else if($city=="Coimbatore"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Coimbatore' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Coimbatore' ";
}
else if($city=="Jaipur"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Jaipur' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Jaipur' ";
}
else if($city=="Dehardun"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Dehardun' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Dehardun' ";
}
else if($city=="Patna"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Patna' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Patna' ";
}
else if($city=="Cochin"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Cochin' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Cochin' ";
}
else if($city=="Nagpur"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Nagpur' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Nagpur' ";
}
else if($city=="Bhopal"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Bhopal' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Bhopal' ";
}
else if($city=="Andhra Pradesh"){
	$sql="SELECT venue,Address,Batch from onsite_details WHERE City LIKE 'Andhra Pradesh' ";
	$exam="UPDATE onsite_details SET Date='$Date' WHERE City LIKE 'Andhra Pradesh' ";
}
?>
<html>
<title>Programming Languages</title>
<link rel="stylesheet" href="onsite details.css">
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
<h2>2/6 City & Slot for Online Examination</h2>
<form action="verification.html" method="post">
<h5>* Select the date for exam:<br>
<select class="date" name="Date" value="date" required>
<option hidden><?php echo"$Date"; ?></option>
</select>
</h5>
<h5>* Select the city you want:<br>
<select class="date" name="City" value="city" required>
<option hidden><?php echo "$city";?></option>
</select>
</h5>
<h5>* Slot:
<table cellpadding="15" align="center" bgcolor="skyblue">
<?php
$result=$conn->query($sql);
while($row=$result->fetch_assoc()){
		echo "<br><tr>";
		echo "<td>".$row["venue"]."</td>";
		echo "<td>".$row["Batch"]."</td></tr>";
		echo "<tr><td>".$row["Address"]."</td></tr>";
	}
$conn->query($exam);
$conn->close();
?>
</table>
</h5>
<table class="level" align="center">
<tr>
<th><input type="submit" name="next" value="Next >"></th>
</tr>
</table>
</form>
</body>
</html>
