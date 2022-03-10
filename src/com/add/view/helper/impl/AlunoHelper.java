package com.add.view.helper.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.add.core.dominio.Aluno;
import com.add.core.dominio.EntidadeDominio;
import com.add.core.dominio.Resultado;
import com.add.view.helper.IViewHelper;

public class AlunoHelper implements IViewHelper {

	Aluno aluno = null;
	
	@Override
	public EntidadeDominio getEntidade(HttpServletRequest request) {
		
		// Verifica qual operação do botão foi acionada
		String operacao = request.getParameter("operacao");

        String nome = null;
        String dt_nascimento = null;
		
		if (("CONSULTAR").equals(operacao)) {
			aluno = new Aluno();
		}
		
		else if (("SALVAR").equals(operacao)) {
			aluno = new Aluno();
			
			nome = request.getParameter("nome");
			dt_nascimento = request.getParameter("dt_nascimento");
			
			aluno.setNome(nome);
			aluno.setDtNascimento(dt_nascimento);
		}
		
		else if (("ALTERAR").equals(operacao)) {
			
		}
		
		else if (("EXCLUIR").equals(operacao)) {
			
		}
		
		return aluno;
	}

	@Override
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// Verifica qual operação do botão foi acionada
		String operacao = request.getParameter("operacao");
		
		// Usa para escrever na tela
		PrintWriter writer = response.getWriter();
		
		if (("CONSULTAR").equals(operacao)) {
			if (resultado.getMensagem() == null || resultado.getMensagem().equals("")) {
				// foi utilizado o getEntidades do resultado para poder pegar o Aluno consultado
				List<EntidadeDominio> entidades = resultado.getEntidades();
				// feito o CAST de Entidade para o Aluno (pegando o primeiro indice da Entidade)
				Aluno aluno = (Aluno) entidades.get(0);
				
				// cria um objeto "sessao" para poder usar o JSESSAOID criado pelo TomCat
				HttpSession sessao = request.getSession();
				
				// salva na sessão o objeto "todos os alunos" do sistema,
				sessao.setAttribute("todosAlunosSistema", aluno.getTodosAlunos());
				
				// Redireciona para o arquivo .JSP
				request.getRequestDispatcher("JSP/lista-alunos.jsp").forward(request, response);
			} 
			else {
				// mostra as mensagens de ERRO se houver
				writer.println(resultado.getMensagem());
				System.out.println("ERRO PARA SALVAR!");
				writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
			}
		}
		
		else if (("SALVAR").equals(operacao)) {
			if (resultado.getMensagem() == null || resultado.getMensagem().equals("")) {
				writer.println("<h1>Cadastro salvo com sucesso!</h1>");
				writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
			}
			else {				
				// mostra as mensagens de ERRO se houver
				writer.println(resultado.getMensagem());
				System.out.println("ERRO PARA SALVAR!");
				writer.println("<input type=\"button\" value=\"Voltar\" onclick=\"history.back()\">");
			}
		}
		
		else if (("ALTERAR").equals(operacao)) {
			
		}
		
		else if (("EXCLUIR").equals(operacao)) {

		}
		
	}

}
