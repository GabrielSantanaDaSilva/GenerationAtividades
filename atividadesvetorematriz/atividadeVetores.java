package GenerationAtividades.atividadesvetorematriz;

import java.util.Scanner;

public class atividadeVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numeros[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }, escolha;

		System.out.println("Escolha um número de 1 a 10: ");
		escolha = leia.nextInt();

		for (int i = 0; i < 10; i++) {

			if (escolha == numeros[i]) {

				System.out.println("O número " + escolha + " é o " + (i + 1) + "° da lista");
			}
		}
		if (escolha < 1 || escolha > 10) {

			System.out.println("Opção inválida");
		}

	}

}
