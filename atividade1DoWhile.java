package generationatividades;

import java.util.Scanner;

public class atividade1DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numero = 0, soma = 0;

		do {

			System.out.println("Digite um numero para a soma (Quando quiser parar digite 0): ");
			numero = leia.nextInt();

			if (numero > 0) {

				soma += numero;

			}

		} while (numero != 0);

		System.out.println("A soma de todos os números Positivos e deu: " + soma);
	}

}
