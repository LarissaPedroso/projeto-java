package bookstore.repository;

import bookstore.books.Books;

public interface Repository {
	
		public void addToCart(Books cod);
		public void deleteToCart(Books cod);
}
