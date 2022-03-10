package com.add.core.strategy.impl;

import com.add.core.dominio.Aluno;
import com.add.core.dominio.EntidadeDominio;
import com.add.core.strategy.IStrategy;

/**
 * Classe para validar o campo data nascimento do Aluno
 * @author Davi Machado
 * @date 09/03/2022
 */
public class ValidarDataNascimento implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade) {
		
		Aluno aluno = (Aluno) entidade;
		
		if(aluno.getDtNascimento() == null || aluno.getDtNascimento().equals("")) {
			return ("Favor insira uma Data de Nascimento.");
		}
		else {
			return null;
		}
	}

}
