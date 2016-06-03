<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri='http://java.sun.com/jstl/core' prefix='c'%>

<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Login</title>
 </head>
 <body>
 <form name="form1" action="ServletLogin" method="post">
 <table align="center">
 <tr>
 <td>Username</td>
 
<td><input type="text" name="usuario" /></td>
 
</tr>
 <tr>
 <td>Password</td>
 <td><input type="password" name="senha" /></td>
 </tr>
 <tr>
 <td><%=(request.getAttribute("errMessage") == null) ? ""
 : request.getAttribute("errMessage")%></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" value="Login"></input>
 <a href="registro.jsp">Registrar</a>
 </tr>
 </table>
 </form>
 
</body>
 </html>