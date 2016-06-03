<%@page import="br.com.viagem.model.Pais"%>
<%@page import="br.com.viagem.controller.Listar"%>
<%@page import="br.com.viagem.controller.ServletListar"%>
<%@page import="java.util.ArrayList"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table><c:forEach items="${listapaises}" var="item">
<tr>
<td>${item.nomePais}</td>
</tr>
</c:forEach>
</table>

</body>
</html>