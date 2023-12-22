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
		
	}
	
	public void sumTotal(float finalPrice) {
		for(int i = 0; i < books.size(); i++) {
			//sum += books[i];
			System.out.println("O valor total: ");
		}
	}

	

	
	

}
