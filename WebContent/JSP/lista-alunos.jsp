<!DOCTYPE html>
<!-- @author Davi Machado-->
<!-- @date 09/03/2022 -->

<%@page import='com.add.core.dominio.*'%>

<%@page import="java.util.List"%>

<html>
<head>
	<title>Listagem dos Alunos</title>
	
	<link href="./CSS/bootstrap.min.css" rel="stylesheet">
	<link href="./CSS/form-default.css" rel="stylesheet" type="text/css">
</head>

<%
	HttpSession sessao = request.getSession();

	// pega todos os alunos do sistema salvo na sessão
	List<Aluno> todosAlunosSistema = (List<Aluno>)sessao.getAttribute("todosAlunosSistema");
%>

<body>
<!-- Header -->
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
  <!-- Fim Header -->
  
  	<h2 style="margin-top: 30px; margin-left: 100px;">Listagem de Todos os Alunos</h2>
  	
	<table border="1" style="margin-top: 30px;" class="table table-striped">
		<tr>
            <th>Nome</th>
            <th>Data Nascimento</th>
        </tr>
		<%
			for(Aluno aluno : todosAlunosSistema) {
		%>
			<tr>
				<td><%=aluno.getNome() %></td>
				<td><%=aluno.getDtNascimento() %></td>
			</tr>
		<%
		}
		%>
	</table>
	
	<input type="button" value="Voltar" onclick="history.back()">
	 
</body>
</html>