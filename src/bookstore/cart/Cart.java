package bookstore.cart;
import java.util.ArrayList;

import bookstore.books.Books;
import bookstore.repository.Repository;

public class Cart implements Repository{
	float sum = 0;

	private ArrayList<Books> books = new ArrayList<Books>();
	@Override
	public void addToCart(Books cod) {
		books.add(cod);
	}

	@Override
	public void deleteToCart(Books cod) {
		books.remove(0);
	}
	
	public void sumTotal() {
		for(int i = 0; i < books.size(); i++) {
			sum += books.get(i).getPrice();
		}
		System.out.println("O valor total: " + sum);
	}
	public void show() {
		for( Books book : books ) {
			System.out.println("Livros no carrinho: \n" + book.getBookName());
		}
	}

	

	
	

}
