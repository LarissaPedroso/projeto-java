package bookstore.books;

public class Books {

	private int cod;
	private String bookName;
	private String bookAuthor;
	private float price;
	
	public Books(int cod, String bookName, String bookAuthor, float price) {
		super();
		this.cod = cod;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.price = price;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	public void view() {
		System.out.println("");
		System.out.println("Código: " + cod);
		System.out.println("Nome: " + bookName);
		System.out.println("Autor: " + bookAuthor);
		System.out.println("Valor R$ " + price);
	}
}
