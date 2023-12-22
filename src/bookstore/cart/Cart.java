package bookstore.cart;
import bookstore.books.Books;
import bookstore.repository.Repository;

public class Cart extends Books implements Repository{


	public Cart(int cod, String bookName, String bookAuthor, float price) {
		super(cod, bookName, bookAuthor, price);
		// TODO Auto-generated constructor stub
	}

	//private ArrayList<Books> books = new ArrayList<Books>();
	@Override
	public void addToCart(Books cod) {
		
	}

	@Override
	public void deleteToCart(Books cod) {
		// TODO Auto-generated method stub
		
	}
	
	public void sumTotal() {
	}

	

	
	

}
