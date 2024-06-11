package GenerationAtividades.atividadesprimeirodia;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		float salario, abono;

		System.out.println("Digite seu sálario: ");

		salario = leia.nextFloat();

		System.out.println("Digite o seu abono: ");

		abono = leia.nextFloat();

		System.out.println("Segue abaixo a atualização de seu salario: ");

		System.out.println((salario + abono));

	}

}
