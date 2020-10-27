<%@page import="java.util.List"%>
<%@page import="com.pojo.Author"%>
<%@page import="com.pojo.Book"%>
<%@page import="com.model.BLManager"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Publication</title>
<style type="text/css">
tr {
	border: thick;
	border-color: yellow;
	height: 3cm;
}
</style>
</head>
<body>
<%
BLManager bl=new BLManager();
Book bo=new Book();
Author au=new Author();

List<Book> b = bl.serachBooklist();
session.setAttribute("list", b);


List<Author>al = bl.serachAuthorlist();
session.setAttribute("list1", al);
%>
<form action="PublicationServlet" method="post">
		<table border="20" bordercolor="red" align="center" width="80%">
			<tr align="center">
				<th>Name of Publication</th>
				<th><input type="text" name="pname"></th>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Price :</td>
				<td><input type="text" name="pprice"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Phone :</td>
				<td><input type="text" name="pphone"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Address :</td>
				<td><input type="text" name="paddress"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Email :</td>
				<td><input type="text" name="pemail"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td>Date of Publication :</td>
				<td><input type="text" name="pdate"></td>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr>
				<td>Book Name</td>
				<td><select name="bname">
				<option>Select Book</option>
				<c:forEach items="${sessionScope.list}" var="b">
				<option>${b.bname}</option>
				</c:forEach>
				</select>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr>
				<td>Author Name</td>
				<td><select name="aname">
				<option>Select Author</option>
				<c:forEach items="${sessionScope.list1}" var="al">
				<option>${al.aname}</option>
				</c:forEach>
				</select>
			</tr>
			<tr align="center">
				<td colspan="2">-----------------------------------------------------</td>
			</tr>
			<tr align="center">
				<td colspan="2"><input type="submit" value="Add Publication"></td>
			</tr>
		</table>
	</form>
</body>
</html>