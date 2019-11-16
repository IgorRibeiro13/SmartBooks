package br.edu.unibratec.smartbooks.controller;

public class BookOperationsFacade {

	private static BookOperationsFacade instancia;
	private static BookController bookController;

	private BookOperationsFacade() {
	}

	public static BookOperationsFacade getInstancia() {
		if (instancia == null) {
			instancia = new BookOperationsFacade();
			bookController = new BookController();

		}

		return instancia;
	}

}
