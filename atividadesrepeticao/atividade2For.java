package GenerationAtividades.atividadesrepeticao;

import java.util.Scanner;

public class atividade2For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numero, pares = 0, impares = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if (numero % 2 == 0) {

				pares++;

			} else if (numero % 2 != 0) {

				impares++;

			}

		}

		System.out.println("Números Pares: " + pares);
		System.out.println("Númeeros Impáres: " + impares);

	}

}
