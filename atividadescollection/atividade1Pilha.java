package GenerationAtividades.atividadescollection;

import java.util.Stack;

import java.util.Scanner;

public class atividade1Pilha {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		Stack<String> pilhaLivros = new Stack<String>();
		int escolha = 4;

		System.out.println("| Tabela                        \n" + "| 1- Adicionar livro na fila: \n"
				+ "| 2- Listar todos os Livros:  \n" + "| 3- Retirar livro da pilha:   \n"
				+ "| 0- Sair:                      \n");

		while (escolha != 0) {

			System.out.println("Segundo a tabela escolha o que deseja fazer: ");
			escolha = read.nextInt();

			switch (escolha) {

			case 1:

				System.out.println("Digite o nome do livro: ");
				read.nextLine();
				pilhaLivros.push(read.nextLine());
				System.out.println("livros: " + pilhaLivros + " \n");
				System.out.println("Livro adicionado!");
				break;

			case 2:

				System.out.println("Pilha: " + pilhaLivros);
				break;

			case 3:

				System.out.println("O Livro " + pilhaLivros.pop() + " Saiu da pilha.");
				break;

			case 0:

				System.out.println("Programa Finalizado! ");
				

			}

		}

		// TODO Auto-generated method stub

	}

}
