<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri='http://java.sun.com/jstl/core' prefix='c'%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Guia de Viagem</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<!--[if lt IE 9]><script src="scripts/html5shiv.js"></script><![endif]-->
</head>
<body>
<div class="wrapper row1">
  <header id="header" class="clear">
    <div id="hgroup">
      <h1><a href="home1.jsp">100 Viagens</a></h1>
      <h2>Conheça o Mundo ao nosso lado</h2>
    </div>
    <nav>
      <ul>
        <li><a href="mundo.jsp">Procurar Destinos</a></li>
        <li><a href="#">Passagens </a></li>
        <li><a href="login1.jsp">Seu Itinerário</a></li>
        <li class="last"><a href="login1.jsp">Login</a></li>
      </ul>
    </nav>
  </header>
</div>
<!-- content -->
<div class="wrapper row2">
  <div id="container" class="clear">
    <!-- Slider -->
    <section id="slider"><a href="#"></a></section>
    <!-- main content -->
    <div id="homepage">
      <!-- Services -->
      <section id="services" class="clear">
        <article class="one_third">
          <figure><img src="paris.jpg" width="290" height="180" alt="">
            <figcaption>
              <h2>Paris</h2>
              <p>Paris</p>
              <footer class="more"><a href="paris.jsp">Read More &raquo;</a></footer>
            </figcaption>
          </figure>	
        </article>
        <article class="one_third">
          <figure><img src="italia.jpg" width="290" height="180" alt="">
            <figcaption>
              <h2>Roma</h2>
              <p>Roma</p>
              <footer class="more"><a href="#">Read More &raquo;</a></footer>
            </figcaption>
          </figure>
        </article>
        <article class="one_third lastbox">
          <figure><img src="egito.jpg" width="290" height="180" alt="">
            <figcaption>
              <h2>Cairo</h2>
              <p>Cairo</p>
              <footer class="more"><a href="#">Read More &raquo;</a></footer>
            </figcaption>
          </figure>
        </article>
      </section>
      <!-- / Services -->
      <!-- ########################################################################################## -->
      <!-- ########################################################################################## -->
      <!-- ########################################################################################## -->
      <!-- ########################################################################################## -->
      <!-- Introduction -->
      <section id="intro" class="last clear">
        <article>
          <figure><img src="orlando.jpg" width="450" height="250" alt="">
            <figcaption>
              <h2>Orlando</h2>
            	<p>Orlando, um dos pontos turísticos mais visitados do mundo</p>
              <footer class="more"><a href="#">Read More &raquo;</a></footer>
            </figcaption>
          </figure>
        </article>
      </section>
      <!-- / Introduction -->
    </div>
    <!-- / content body -->
  </div>
</div>
<!-- Footer -->
<div class="wrapper row3">
  <div id="footer" class="clear">
    <!-- Section One -->
    <section class="one_quarter">
      <h2 class="title">Europa</h2>
      <nav>
        <ul>
          <li><a href="#">Berlim</a></li>
          <li><a href="#">Londres</a></li>
          <li><a href="#">Milão</a></li>
          <li><a href="#">Lisboa</a></li>
          <li class="last"><a href="#">Barcelona</a></li>
        </ul>
      </nav>
    </section>
    <!-- Section Two -->
    <section class="one_quarter">
      <h2 class="title">Ásia</h2>
      <nav>
        <ul>
          
          <li><a href="#">Pequim</a></li>
          <li><a href="#">Hong Kong</a></li>
          <li><a href="#">Camboja</a></li>
          <li><a href="#">Vietnã</a></li>
          <li class="last"><a href="#">Indonésia</a></li>
        </ul>
      </nav>
    </section>
    <!-- Section Three -->
    <section class="one_quarter">
      <h2 class="title">África</h2>
      <nav>
        <ul>
          <li><a href="#">Senegal</a></li>
          <li><a href="#">Congo</a></li>
          <li><a href="#">Etiópia</a></li>
          <li><a href="#">Tanzania</a></li>
          <li class="last"><a href="#">Mali</a></li> </ul>
      </nav>
    </section>
    <!-- Section Four -->
    
    <section class="one_quarter lastbox">
      <h2 class="title">Oceania</h2>
      <nav>
        <ul>
          <li><a href="#"></a></li>
          <li><a href="#"></a></li>
          <li><a href="#"></a></li>
          <li><a href="#"></a></li>
          <li class="last"><a href="#"></a></li>
        </ul>
      </nav>
    </section>
    <!-- / Section -->
  </div>
</div>
</body>
</html>
