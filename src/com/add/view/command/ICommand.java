package com.add.view.command;

import com.add.core.dominio.EntidadeDominio;
import com.add.core.dominio.Resultado;

public interface ICommand {
	
	public Resultado execute (EntidadeDominio entidade);
	
}
