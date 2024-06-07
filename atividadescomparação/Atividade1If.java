package generationatividades.atividadescomparação;

import java.util.Scanner;
import java.util.Scanner;

public class Atividade1If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int valor1, valor2, valor3;

		System.out.println("Digite um número: ");
		valor1 = leia.nextInt();

		System.out.println("Digite um número: ");
		valor2 = leia.nextInt();

		System.out.println("Digite um número: ");
		valor3 = leia.nextInt();

		if (valor1 + valor2 > valor3) {

			System.out.println("A soma de " + valor1 + " + " + valor2 + " é maior que " + valor3 + ".");

		}
		if (valor1 + valor2 < valor3) {

			System.out.println("A soma de " + valor1 + " + " + valor2 + " é menor que " + valor3 + ".");

		}
		if (valor1 + valor2 == valor3) {

			System.out.println("A soma de " + valor1 + " + " + valor2 + " é igual a " + valor3 + ".");

		}

	}

}
