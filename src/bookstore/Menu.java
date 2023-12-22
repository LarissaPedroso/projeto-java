package bookstore;
import java.util.Scanner;

import bookstore.util.Cores;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	

	public static void main(String[] args) {
	
		int option;
		int cod;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println(Cores.TEXT_YELLOW_BOLD);
			System.out.println("***********************************");
			System.out.println("             BookPlace            ");
			System.out.println("***********************************\n");
			System.out.println("Digite: ");
			System.out.println("1 - Adicionar ao carrinho");
			System.out.println("2 - Sair");
			System.out.println("\n***********************************");
			System.out.println(Cores.TEXT_RESET);
			System.out.println("Sua escolha: ");
			option = read.nextInt();
			if(option == 1) {
				System.out.println("Digite o código do livro desejado: ");
				cod = read.nextInt();
				System.out.println("O código do livro digitado foi: " + cod);
			}else {
				System.out.println("BookPlace agradece!");
			}
		}while(option == 1);
		read.close();
	}
}	

