package com.add.core.dominio;

import java.util.List;

public class Aluno extends EntidadeDominio {
	private String nome;
	private String dtNascimento;
	private List<Aluno> todosAlunos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public List<Aluno> getTodosAlunos() {
        return todosAlunos;
    }
    public void setTodosAlunos(List<Aluno> todosAlunos) {
        this.todosAlunos = todosAlunos;
    }
}
