package GenerationAtividades.atividadescollection;

import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;

public class atividade1Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		ArrayList<String> setCores = new ArrayList<String>();

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite o nome da " + (i + 1) + "° cor: ");

			setCores.add(leia.nextLine());

		}
		System.out.println("Cores: ");

		Iterator<String> iCores = setCores.iterator();
		while (iCores.hasNext()) {

			System.out.println(iCores.next());

		}

		System.out.println("Cores ordenadas: ");

		setCores.sort(null);

		for (int i = 0; i < 5; i++) {

			System.out.println(setCores.get(i));
		}

	}

}
