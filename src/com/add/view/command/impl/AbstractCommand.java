package com.add.view.command.impl;

import com.add.core.fachada.IFachada;
import com.add.core.fachada.impl.Fachada;
import com.add.view.command.ICommand;

public abstract class AbstractCommand implements ICommand {
	
	protected IFachada fachada = new Fachada();
	
}
