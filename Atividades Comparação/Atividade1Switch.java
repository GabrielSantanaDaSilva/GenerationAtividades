package generationatividades;
import java.util.Scanner;

public class Atividade1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int pedido, quantidade, valor = 0;
		String produto = "";
		
		
		System.out.println("|        Produtos             |\n"+
						   "| 1- Cachorro Quente: R$10,00 |\n"+
						   "| 2- X-Salada:        R$15,00 |\n"+ 
						   "| 3- X-Bacon          R$18,00 |\n"+
						   "| 4- Bauru            R$12,00 |\n"+
						   "| 5- Refrigerante     R$08,00 |\n"+
						   "| 6- Suco de Laranja  R$13,00 |\n");
		
		System.out.println("Qual o seu pedido? ");
		pedido = leia.nextInt();
		
		switch(pedido) {
		
		case 1 :
			valor = 10;
			produto = "Cachorro Quente";
			break;
		
		case 2 :
			valor = 15;
			produto = "X-Salada";
			break;
			
		case 3 :
			valor = 18;
			produto = "X-Bacon";
			break;
			
		case 4 :
			valor = 12;
			produto = "Bauru";
			break;
			
		case 5 :
			valor = 8;
			produto = "Refrigerante";
			break;
			
		case 6 :
			valor = 13;
			produto = "Suco de Laranja";
			break;
		}
		
		System.out.println("Escolha a Quantidade: ");
		quantidade = leia.nextInt();
		
		
		valor *=  quantidade;
		
		System.out.println("Pedido: "+produto+ "\n");
		System.out.println("Quantidade: "+quantidade+"\n");
		System.out.println("Valor a pagar: R$"+valor+",00\n");
		
		

	}

}
