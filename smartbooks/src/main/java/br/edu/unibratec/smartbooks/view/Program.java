package br.edu.unibratec.smartbooks.view;

import br.edu.unibratec.smartbooks.controller.BookOperationsFacade;

public class Program {

	public static void main(String[] args) {

		BookOperationsFacade facade = BookOperationsFacade.getInstancia();
		
		OperationsView program = new OperationsView();
		
		int opcao = program.menu();
		
		program.opcoesMenu(opcao);

	}

}
