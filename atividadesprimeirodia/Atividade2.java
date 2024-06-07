package generationatividades.atividadesprimeirodia;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// TODO Auto-generated method stub

		float nota1, nota2, nota3, nota4, media;

		System.out.println("Qual foi a sua primeira nota? ");

		nota1 = leia.nextFloat();

		System.out.println("Qual foi sua segunda nota? ");

		nota2 = leia.nextFloat();

		System.out.println("Qual foi a sua terceira nota? ");

		nota3 = leia.nextFloat();

		System.out.println("Qual foi sua quarta nota? ");

		nota4 = leia.nextFloat();

		System.out.println("Segue abaixo sua média final: ");
		System.out.println((nota1 + nota2 + nota3 + nota4) / 4);

	}

}
