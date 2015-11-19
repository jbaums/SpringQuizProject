<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<title>Quiz Project</title>
</head>

<body bgcolor="#F8F8E8">

	<center>
		<h2>Quiz Project</h2>
	</center>

	<p>This application will analyze your risk tolerance. We will
		recommend a basket of securities based on your responses</p>
	<br>
	<br>
	<p>To obtain above-average returns on my Investments, I am willing
		to accept above-average risk.</p>
	<form>
		<input type="radio" name="ans1" value="1">Option 1<br> <input
			type="radio" name="ans1" value="2">Option 2<br> <input
			type="radio" name="ans1" value="3">Option 3<br>
	</form>
	<br>
	<p>To obtain above-average returns on my Investments, I am willing
		to accept above-average risk.</p>
	<form>
		<input type="radio" name="ans1" value="1">Option 1<br> <input
			type="radio" name="ans1" value="2">Option 2<br> <input
			type="radio" name="ans1" value="3">Option 3<br>
	</form>
	<br>
	<p>If my investments lose money over the course of a year, I can
		easily resist the temptation to sell them.</p>
	<form>
		<input type="radio" name="ans1" value="1">Option 1<br> <input
			type="radio" name="ans1" value="2">Option 2<br> <input
			type="radio" name="ans1" value="3">Option 3<br>
	</form>
	<br>
	<p>When I put aside money for retirement, I do not plan on
		accessing it before I retire.</p>
	<form>
		<input type="radio" name="ans1" value="1">Option 1<br> <input
			type="radio" name="ans1" value="2">Option 2<br> <input
			type="radio" name="ans1" value="3">Option 3<br> <br>
	</form>

	<form action="Submit.do">
		<input type="submit" value="Submit Quiz" />
	</form>
	<b><a href="index.jsp">BACK</a></b>
</body>