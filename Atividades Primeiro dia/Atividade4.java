package generationatividades;

import java.util.Scanner;

public class Atividade4 {
	
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
			float n1, n2, n3, n4 ;
		
		
				System.out.println("Digite um número: ");
			
				n1 = leia.nextFloat();
				
				System.out.println("Digite outro número: ");
				
				n2 = leia.nextFloat();
				
				System.out.println("Digite outro número: ");
				
				n3 = leia.nextFloat();
				
				System.out.println("Digite o quato número: ");
				
				n4 = leia.nextFloat();
				
				System.out.println("A diferença do produto entre n1 e n2 e n3 e n4 é: ");
				
				System.out.println((n1 * n2) - (n3 * n4));
				

	}

}
