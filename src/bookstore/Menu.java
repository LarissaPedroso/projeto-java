package bookstore;
import java.util.Scanner;

import bookstore.books.Books;
import bookstore.util.Colors;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	

	public static void main(String[] args) {
	
		Books b1 = new Books(1, "Hunger Games", "Suzanne Collins", 50.0f);
		Books b2 = new Books(2, "1984", "George Orwell", 60.0f);
		
		int option;
		int cod;
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println(Colors.TEXT_YELLOW_BOLD);
			System.out.println("***********************************");
			System.out.println("             BookPlace            ");
			System.out.println("***********************************\n");
			System.out.println("Digite: ");
			System.out.println("1 - Adicionar ao carrinho");
			System.out.println("2 - Sair");
			System.out.println("\n***********************************");
			System.out.println(Colors.TEXT_RESET);
			System.out.println("Sua escolha: ");
			option = read.nextInt();
			if(option == 1) {
				System.out.println("Digite o código do livro desejado: ");
				cod = read.nextInt();
				if(cod == b1.getCod()){
					System.out.println("Livro: " + b1.getBookName() + " - " + b1.getBookAuthor());
					System.out.println("Preço: " + b1.getPrice());
				}else if(cod == b2.getCod()){
					System.out.println("Livro: " + b2.getBookName() + " - " + b2.getBookAuthor());
					System.out.println("Preço: " + b2.getPrice());
				}
			}else {
				System.out.println("BookPlace agradece!");
			}
		}while(option == 1);
		read.close();
		
	}
}	

