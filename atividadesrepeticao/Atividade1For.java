package generationatividades.atividadesrepeticao;

import java.util.Scanner;

public class Atividade1For {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Digite um número: ");
		numero1 = leia.nextInt();

		System.out.println("Digite um numero maior que o primeiro: ");
		numero2 = leia.nextInt();

		if (numero1 > numero2) {

			System.out.println("Intervalo Inválido");

		} else {
			System.out.println("No intervalo entre " + numero1 + " e " + numero2 + ": ");

			for (int i = numero1; i < numero2; i++) {

				if (i % 3 == 0 && i % 5 == 0) {

					System.out.println("O número " + i + " é multiplo de 3 e 5.");

				}

			}

		}
	}
}
