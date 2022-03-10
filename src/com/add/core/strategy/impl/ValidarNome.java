package com.add.core.strategy.impl;

import com.add.core.dominio.Aluno;
import com.add.core.dominio.EntidadeDominio;
import com.add.core.strategy.IStrategy;

/**
 * Classe para validar o campo nome do Aluno
 * @author Davi Machado
 * @date 09/03/2022
 */
public class ValidarNome implements IStrategy {

	@Override
	public String validar(EntidadeDominio entidade) {
		
		Aluno aluno = (Aluno) entidade;
		
		if(aluno.getNome() == null || aluno.getNome().equals("")) {
			return ("Favor insira um nome.");
		}
		else {
			return null;
		}
	}

}
