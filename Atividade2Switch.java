package generationatividades;
import java.util.Scanner;


public class Atividade2Switch {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		float numero1 = 0, numero2 = 0;
		int operacao = 0;
		
		System.out.println("Digite um numero: ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite outro numero: ");
		numero2 = leia.nextFloat();
		
		System.out.println("|   Calculadora   |\n"
				+ 		   "|1- Soma          |\n"
				+ 		   "|2- Subtração     |\n"
				+ 		   "|3- Multiplicação |\n"
				+ 		   "|4- Divisão       |\n");
		
		operacao = leia.nextInt();
		
		
		
		
			switch(operacao) {
			 
			  case 1 :
				  System.out.println(numero1+" + "+numero2+" = "+ (numero1+numero2) );
				  break;
				  
			  case 2 :
				  System.out.println(numero1+" - "+numero2+" = "+ (numero1 - numero2) );
				  break;
				  
			  case 3 :
				  System.out.println(numero1+" + "+numero2+" = "+ (numero1*numero2) );
				  break;
				  
			  case 4 :
				  System.out.println(numero1+" x "+numero2+" = "+ (numero1/numero2) );
				  break;
			}
			
					

	}

}
