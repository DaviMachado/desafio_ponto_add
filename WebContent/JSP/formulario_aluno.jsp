<!DOCTYPE html>
<!-- @author Davi Machado-->
<!-- @date 09/03/2022 -->

<%@page import='com.add.core.dominio.*'%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<html>
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Formulário do Aluno</title>
		
		<link href="../CSS/bootstrap.min.css" rel="stylesheet">
  		<link href="../CSS/form-default.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
		  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
		    <div class="container">
		      <a class="navbar-brand">Desafio .ADD</a>
		      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
		        <span class="navbar-toggler-icon"></span>
		      </button>
		      <div class="collapse navbar-collapse" id="navbarResponsive">
		        <ul class="navbar-nav ml-auto">
		          <li class="nav-item">
		            <span class="sr-only">(current)</span>
		          </li>
		        </ul>
		      </div>
		    </div>
		  </nav>
	
		<fieldset class="form-group fieldset_form" style="margin-top: 48px">
		<legend align="center">Formulário do Aluno</legend>
			<form class="form_form" action="http://localhost:8080/desafio_ponto_add/aluno">
			  	
				<div class="form-row">
					<!-- Nome -->
				    <div class="form-group col-md-8">
				      <label>Nome</label>
				      <input type="text" class="form-control" name="nome" placeholder="Nome" required>
				    </div>

				    <!-- Data Nascimento -->
				    <div class="form-group col-md-2">
				      <label>Data Nascimento</label>
				      <input type="date" class="form-control" name="dt_nascimento" placeholder="Data Nascimento" required>
				    </div>
			  	</div>
			  	
			  	<!-- Cadastrar -->
				<div class="form-row">
			  		<!-- Botóes CRUD -->
			  		<div class="form-group col-md-12">
				  		<div align="right" style="margin-top: 24px">
				  			<button class="btn btn-success" name="operacao" value="SALVAR">Cadastrar</button>
				  		</div>
			  		</div>
			  	</div>

			</form>
			
			<!-- Consultar -->
			<form class="form" action="http://localhost:8080/desafio_ponto_add/aluno">
				<!-- Botões CRUD -->
	  			<div align="right" style="margin-top: 10px">
	  				<button class="btn btn-primary" name="operacao" value="CONSULTAR">Consultar</button>
	  			</div>
			</form>
		</fieldset>
		
	  <!-- Footer -->
	  <footer class="py-5 bg-dark">
	    <div class="container">
	      <p class="m-0 text-center text-white">Copyright &copy; .ADD 2022</p>
	    </div>
	  </footer>
  	  <!-- Fim Footer -->
		
	</body>
</html>