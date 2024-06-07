package generationatividades;

import java.util.Scanner;

public class atividade1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int idade = 1, maiorcinquentaanos = 0, menorvinteumanos = 0;

		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();

			if (idade < 21 && idade >= 0) {

				menorvinteumanos++;

			} else if (idade > 50) {

				maiorcinquentaanos++;

			}

			System.out.println("Deseja colocar mais uma idade? (Se não, coloque qualquer numero negativo): ");

		}

		System.out.println("Maiores de 50 anos: " + maiorcinquentaanos);
		System.out.println("Menores de 21 anos: " + menorvinteumanos);

	}
}
