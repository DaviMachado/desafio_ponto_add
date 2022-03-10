package com.add.core.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.add.core.dominio.Aluno;
import com.add.core.dominio.EntidadeDominio;

public class AlunoDAO extends AbstractJdbcDAO {
	
	/**
	 * Metodo para salvar o Aluno
	 * @param entidade
	 */
	public void salvar(EntidadeDominio entidade) {
		openConnection();
		
		String sql = "insert into aluno "+
				"(nome, dt_nascimento)" +
				"values (?,?)";
		
		try {
			Aluno aluno = (Aluno) entidade;
			
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1,aluno.getNome());
			stmt.setString(2, aluno.getDtNascimento());
			
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Salvar
	
	
	/**
	 * Metodo para alterar o Aluno
	 * @param entidade
	 */
	public void alterar (EntidadeDominio entidade) {
		openConnection();
		
		String sql = "update aluno set " +
					 "nome=?, dt_nascimento=? where id=?";
		
		try {
			Aluno aluno = (Aluno) entidade;

			PreparedStatement stmt = connection.prepareStatement(sql);
			
			stmt.setString(1, aluno.getNome());
			stmt.setString(2, aluno.getDtNascimento());
			stmt.setString(3, aluno.getId());
			
			stmt.execute();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Alterar
	
	
	/**
	 * Metodo para Excluir o Aluno
	 * @param entidade
	 */
	public void excluir (EntidadeDominio entidade) {
		openConnection();
		
		try {
			Aluno aluno = (Aluno) entidade;
			
			PreparedStatement stmt = connection.prepareStatement("delete from aluno where id=?");
			stmt.setString(1, aluno.getId());
			
			stmt.executeUpdate();
			stmt.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Excluir
	
	
	/**
	 * Metodo para Listar o Aluno
	 * @param entidade
	 * @return
	 */
	public List<EntidadeDominio> consultar (EntidadeDominio entidade){
		openConnection();
		try {
			List<EntidadeDominio> listAlunos = new ArrayList<>();
			
			PreparedStatement stmt = connection.prepareStatement("select * from aluno");
			ResultSet rs = stmt.executeQuery();
			
			List<Aluno> todosAlunos = new ArrayList<>();
			while (rs.next()) {
				Aluno aluno = new Aluno();
				
				aluno.setNome(rs.getString("nome"));
				aluno.setDtNascimento(rs.getString("dt_nascimento"));
				
				todosAlunos.add(aluno);
			}
			
			Aluno novoAluno = new Aluno();
			novoAluno.setTodosAlunos(todosAlunos);
			
			listAlunos.add(novoAluno);
			
			rs.close();
			stmt.close();
			return listAlunos;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	} // Listar
	
}
