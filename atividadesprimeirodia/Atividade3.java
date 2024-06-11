package GenerationAtividades.atividadesprimeirodia;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// TODO Auto-generated method stub

		float salariobruto, adicionalnoturno, horasextras, descontos;

		System.out.println("Qual o seu salario bruto? ");

		salariobruto = leia.nextFloat();

		System.out.println("E o seu adicional noturno? ");

		adicionalnoturno = leia.nextFloat();

		System.out.println("Quanto ganhou pelas horas extras? ");

		horasextras = leia.nextFloat();

		System.out.println("E os descontos? ");

		descontos = leia.nextFloat();

		System.out.println("Segue abaixo seeu Salário Líquido");

		System.out.println(salariobruto + adicionalnoturno + (horasextras * 5) - descontos);

	}

}
