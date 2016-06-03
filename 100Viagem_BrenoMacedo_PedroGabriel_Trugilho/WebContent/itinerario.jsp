<%@page import="br.com.viagem.controller.GetPassagem"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri='http://java.sun.com/jstl/core' prefix='c'%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guia de Viagem</title>
<link rel="stylesheet" href="css/style.css" type="text/css">

<style type="text/css">
*{ margin:0; padding:0;}

body{ font:100% normal Arial, Helvetica, sans-serif; background:#161712;}

form,input,select,textarea{margin:0; padding:0; color:#ffffff;}

div.box {
    margin:0 auto;
    width:500px;
    background:#222222;
    position:relative;
    top:50px;
    border:1px solid #262626;
}

 h1 { 
    color:#ffffff;
    font-size:30px;
    text-transform:uppercase;
    padding:5px 0 5px 5px;
    border-bottom:1px solid #161712;
    border-top:1px solid #161712; 
}
div.box label {
    width:100%;
    display: block;
    background:#1C1C1C;
    border-top:1px solid #262626;
    border-bottom:1px solid #161712;
    padding:10px 0 10px 0;
}

div.box label span {
    display: block;
    color:#bbbbbb;
    font-size:12px;
    float:left;
    width:100px;
    text-align:right;
    padding:5px 20px 0 0;
}

div.box .input_text {
    padding:10px 10px;
    width:200px;
    background:#262626;
    border-bottom: 1px double #171717;
    border-top: 1px double #171717;
    border-left:1px double #333333;
    border-right:1px double #333333;
}
div.box .button{
    margin:0 0 10px 0;
    padding:4px 7px;
    background:#CC0000;
    border:0px;
    position: relative;
    top:10px;
    left:382px;
    width:100px;
    border-bottom: 1px double #660000;
    border-top: 1px double #660000;
    border-left:1px double #FF0033;
    border-right:1px double #FF0033;
}

</style>
</head>
<body>

<%
	String user = null;
	String teste = "primeiro acesso";
	if(session.getAttribute("usuario") == null){
	    response.sendRedirect("login1.jsp");
	    
	}
	else user = (String) session.getAttribute("usuario");
	//ArrayList<String> priceList = new ArrayList<String>();
	
	/*for(int i = 0; i < Integer.parseInt((String)session.getAttribute("tamanho"));i++){
		priceList.add((String) session.getAttribute("rola" + i));
	}*/
	if(session.getAttribute("tamanho") != null){
		teste = (String) session.getAttribute("tamanho");
	}
%>
<div class="wrapper row1">
  <header id="header" class="clear">
    <div id="hgroup">
      <h1><a href="homeSucess.jsp"><center>100 Viagens</center></a></h1>
      <h2>Conheça o Mundo ao nosso lado</h2>
    </div>
    <nav>
      <ul>
        <li><a href="#">Procurar Destinos</a></li>
        <li><a href="#">Passagens</a></li>
        <li><a href="itinerario.jsp">Seu Itinerário</a></li>
        
        <li><%=user %></li>
       <li><a href="ServletLogout">Sair</a></li>
      </ul>
    </nav>
  </header>
</div>
<form name="meuForm" action="ServletItinerario"  method="post">
	<div class="box"> 
		<h1><center>Insira seu Roteiro de Viagem </center></h1>
 		<label> 
			<span>Cidade Origem</span>
 			<input type="text" class="input_text" name="cid0" />
 
		</label>
 
		<label>
 			<span>Cidade Destino</span>
			<input type="text" class="input_text" name="cid2" />
		 </label>
 
		<label>
 			<span>Data</span>
			<input type="text" class="input_text" name="data" />
		</label>
 
 		<label>
			 <input type="submit" class="button" value="Enviar" />
		</label>          
	</div>
</form>
<div>

</div> 
</body>
</html>
