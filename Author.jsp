<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
tr {
	border: thick;
	border-color: yellow;
	height: 3cm;
}
</style>
</head>
<body>
	<form action="AuthorServlet" method="post">
		<table border="20" bordercolor="red" align="center" width="80%">
			<tr align="center">
				<th>Name of Author</th>
				<th><input type="text" name="aname"></th>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Email :</td>
				<td><input type="text" name="aemail"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Phone :</td>
				<td><input type="text" name="aphone"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Address :</td>
				<td><input type="text" name="aaddress"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Author"></td>
			</tr>
		</table>
	</form>
</body>
</html>