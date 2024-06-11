package GenerationAtividades.atividadescollection;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class atividade1Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);

		int escolha = 4;
		Queue<String> queueBanco = new LinkedList<String>();

		System.out.println("| Tabela                        \n" + "| 1- Adicionar cliente na fila: \n"
				+ "| 2- Listar todos os Clientes:  \n" + "| 3- Retirar cliente da fila:   \n"
				+ "| 0- Sair:                      \n");

		while (escolha != 0) {

			System.out.println("Segundo a tabela escolha o que deseja fazer: ");
			escolha = read.nextInt();

			switch (escolha) {

			case 1:

				System.out.println("Digite o nome do cliente: ");
				read.nextLine();
				queueBanco.add(read.next());
				System.out.println("CLientes: "+queueBanco+" \n");
				System.out.println("Cliente adicionado!");
				break;

			case 2:

				System.out.println("Fila: "+queueBanco);
				break;

			case 3:

				System.out.println("O cliente " + queueBanco.poll() + " foi atendido.");
				break;

			case 0:

				System.out.println("Programa Finalizado! ");
				

			}

		}

	}

}
