package atividadescollection;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class atividade1Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite o " + (i + 1) + "° número: ");
			setNumeros.add(leia.nextInt());
		}

		Iterator<Integer> iNumeros = setNumeros.iterator();

		while (iNumeros.hasNext()) {

			System.out.println(iNumeros.next());

		}

	}

}
