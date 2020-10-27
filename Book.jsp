<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book</title>
<style type="text/css">
tr {
	border: thick;
	border-color: yellow;
	height: 3cm;
}
</style>
</head>
<body>
	<form action="BookServlet" method="post">
		<table border="20" bordercolor="red" align="center" width="80%">
			<tr align="center">
				<th>Name of Book</th>
				<th><input type="text" name="bname"></th>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Date of complete :</td>
				<td><input type="text" name="bdate"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Book"></td>
			</tr>
		</table>
	</form>
</body>
</html>