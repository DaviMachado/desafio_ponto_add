package com.add.core.fachada;

import com.add.core.dominio.EntidadeDominio;
import com.add.core.dominio.Resultado;

public interface IFachada {
	
	public Resultado salvar(EntidadeDominio entidade);
    public Resultado alterar(EntidadeDominio entidade);
    public Resultado excluir(EntidadeDominio entidade);
    public Resultado consultar(EntidadeDominio entidade);
	
}
