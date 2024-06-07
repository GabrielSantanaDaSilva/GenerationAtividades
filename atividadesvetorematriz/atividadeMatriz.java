package generationatividades.atividadesvetorematriz;

import java.util.Scanner;

public class atividadeMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int elementos[][] = new int[3][3], somaPrincipal, somaSecundaria;

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.println("Escreva um número");
				elementos[linha][coluna] = leia.nextInt();

			}

		}

		somaPrincipal = elementos[0][0] + elementos[1][1] + elementos[2][2];
		somaSecundaria = elementos[0][2] + elementos[1][1] + elementos[2][0];

		System.out.println(
				"Diagonal Principal: " + elementos[0][0] + " " + elementos[1][1] + " " + elementos[2][2] + "\n");
		System.out.println(
				"Diagonal Secundária: " + elementos[0][2] + " " + elementos[1][1] + " " + elementos[2][0] + "\n");
		System.out.println("A soma total da diagonal principal é " + somaPrincipal);
		System.out.println("A soma total da diagonal secundária é " + somaSecundaria);

	}

}
