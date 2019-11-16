package br.edu.unibratec.smartbooks.view;

import java.util.Scanner;

import br.edu.unibratec.smartbooks.model.Book;

public class OperationsView {

	Scanner scanner = new Scanner(System.in);

	public int menu() {
		System.out.println("---------------------");
		System.out.println("O que deseja fazer?");
		System.out.println("---------------------");
		System.out.println("1- Adicionar Livro");
		System.out.println("2- Excluir Livro");
		System.out.println("3- editar livro");
		System.out.println("4- Listar Livros");
		System.out.println("0- Sair");
		System.out.println();
		System.out.println("Digite sua opção: ");
		int opcao = scanner.nextInt();
		return opcao;
		//teste

	}

	public void opcoesMenu(int opcao) {
		switch (opcao) {
		case 1:
			exibirMenuAdicionar();
			break;
		case 2:
			// excluirLivro();
			menu();
			break;
		case 3:
			// exibirEdicaoDeLivro();
			menu();
			break;
		case 4:
			// exibirTipoLista();
			menu();
		case 0:
			// sairDoSistema();
			break;
		default:
			System.out.println("-----------------------------");
			System.out.println("-------Opção Inválida!-------");
			System.out.println("Digite um número de entre 0-4");
			System.out.println("-----------------------------");
			break;
		}

	}

	public void exibirMenuAdicionar() {
		int opcoesAdicionar = 0;
		
		do {

			System.out.println("-----------------------------");
			System.out.println("1- Adicionar Titulo");
			System.out.println("2- Adicionar Autor");
			System.out.println("3- Adicionar Editora");
			System.out.println("4- Adicionar Ano de Publicação");
			System.out.println("5- Adicionar URL");
			System.out.println("6- Adicionar Tamanho do eBook");
			System.out.println("7- Tipo do Livro");
			System.out.println("-----------------------------");
			System.out.println("Qual campo você deseja adicionar?");

			try {
				opcoesAdicionar = scanner.nextInt();
				menuAdicionar(opcoesAdicionar);	
				
			} catch (Exception e) {
				
				System.out.println("-----------------------------");
				System.out.println("-------Opção Inválida!-------");
				System.out.println("Digite um número de entre 1-7");
				System.out.println("-----------------------------");

			}
			
		} while (opcoesAdicionar == 0);
		

	}

	private void menuAdicionar(int opcoesAdicionar) {
		Book livro = new Book();

		if (opcoesAdicionar == 1) {
			System.out.print("Digite o titulo do livro:");

		} else if (opcoesAdicionar == 2) {
			System.out.print("Digite o nome do Autor: ");

		} else if (opcoesAdicionar == 3) {
			System.out.print("Digite o nome da editora: ");

		} else if (opcoesAdicionar == 4) {
			System.out.print("Digite o ano de publicação: ");

		} else if (opcoesAdicionar == 5) {
			System.out.print("Informe o URL: ");

		} else if (opcoesAdicionar == 6) {
			System.out.print("Informe o tamanho do livro: ");

		} else {
			System.out.println("Digite o tipo do livro: ");
			System.out.println("------------------------");
			System.out.println("1- Livro Fisico");
			System.out.println("2- eBook");
			System.out.println("------------------------");
		}

//		System.out.println();
//		System.out.print("Digite o titulo do livro:");
//		livro.se
//		System.out.print("Digite o nome do Autor: ");
//		String autor = scannet.next();
//		System.out.print("Digite o nome da editora: ");
//		String editora = scanne.next();
//		System.out.print("Digite o ano de publicação: ");
//		String ano = entrada.next();
//		String tipoLivro = exibirTipoLivro();
//		if (tipoLivro == "eBook") {
//			System.out.print("Informe o URL: ");
//			url = entrada.next();
//			System.out.print("Informe o tamanho do livro: ");
//			tamanho = entrada.next();
//			
//
//		}

	}

}
