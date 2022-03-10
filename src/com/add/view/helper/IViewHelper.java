package com.add.view.helper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.add.core.dominio.EntidadeDominio;
import com.add.core.dominio.Resultado;

public interface IViewHelper {
	
	public EntidadeDominio getEntidade(HttpServletRequest request);
	
	public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
