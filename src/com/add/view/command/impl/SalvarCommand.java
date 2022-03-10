package com.add.view.command.impl;

import com.add.core.dominio.EntidadeDominio;
import com.add.core.dominio.Resultado;

public class SalvarCommand extends AbstractCommand {

	@Override
	public Resultado execute(EntidadeDominio entidade) {
		return fachada.salvar(entidade);
	}

}
