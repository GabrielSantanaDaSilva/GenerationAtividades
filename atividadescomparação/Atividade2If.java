package generationatividades.atividadescomparação;
import java.util.Scanner;

public class Atividade2If {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		
		int numero ;
		
		System.out.println("Digite um número");
		numero = leia.nextInt();
		
			  if(numero % 2 == 0 && numero > 0) {
			
			System.out.println("O número "+numero+" é par e positivo");
			
		}else if(numero % 2 == 0 && numero < 0) {
			
			System.out.println("O número "+numero+" é par e negativo");
			
		}else if(numero % 2 != 0 && numero > 0) {
			
			System.out.println("O número "+numero+" é impar e positivo");
			
		}else if(numero % 2 != 0 && numero < 0) {
			
			System.out.println("O número "+numero+" é impar e negativo");
			
		}else{
			
			System.out.println("O número é igual a 0");
			
		}
		

	}

}
