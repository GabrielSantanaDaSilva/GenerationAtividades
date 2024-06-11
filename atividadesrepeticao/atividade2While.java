package GenerationAtividades.atividadesrepeticao;

import java.util.Scanner;

public class atividade2While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int idade, identidadedegenero, desenvolvedor, quantidadebackend = 0, quantidadefrontend = 0,
				quantidademobile = 0, quantidadefullstack = 0, totalpessoas = 0, media = 0, idadetotal = 0;

		char continua = 's';

		while (continua != 'n') {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			// A média de idade das pessoas que responderam à pesquisa
			idadetotal += idade;

			System.out.println("Escolha seu genero: " + " 1- Mulher Cis" + " 2- Homem Cis" + " 3- Não Binário"
					+ " 4- Mulher Trans" + " 5- Homem Trans" + " 6- Outros");

			System.out.println("Digite com base nos números");
			identidadedegenero = leia.nextInt();

			System.out
					.println("Escolha seu genero: " + " 1- Backend" + " 2- Frontend" + " 3- Mobile" + " 4- Fullstack");

			System.out.println("Digite com base nos números");
			desenvolvedor = leia.nextInt();

			// O número de pessoas desenvolvedoras Backend

			switch (desenvolvedor) {
			case 1:

				quantidadebackend++;
				totalpessoas++;
				break;

			}

			// O número de Mulheres Cis e Trans desenvolvedoras Frontend

			switch (desenvolvedor) {
			case 2:

				if (identidadedegenero == 1 || identidadedegenero == 4) {

					quantidadefrontend++;
					break;
				}

				totalpessoas++;

			}
			// O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos

			switch (desenvolvedor) {
			case 3:

				if (identidadedegenero == 2 || identidadedegenero == 5 && idade > 40) {

					quantidademobile++;
					break;
				}
				totalpessoas++;
			}
			// O número de Não Binários desenvolvedores FullStack menores de 30 anos

			switch (desenvolvedor) {
			case 4:

				if (identidadedegenero == 3 && idade < 30) {

					quantidadefullstack++;
					break;
				}
				totalpessoas++;
			}

			System.out.println("Você deseja adicionar mais alguem? ");
			continua = leia.next().charAt(0);

		}

		System.out.println("Total de pessoas desenvolvedoras de backend: " + quantidadebackend);

		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + quantidadefrontend);

		System.out
				.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + quantidademobile);

		System.out.println(
				"Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + quantidadefullstack);

		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalpessoas);

		System.out.println("A média de idade das pessoas que responderam à pesquisa: " + (idadetotal / totalpessoas));

	}

}
