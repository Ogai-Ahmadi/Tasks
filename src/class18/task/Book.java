package class18.task;

public class Book {
	
	static long isbn;
	String title;
	String author;
	
	Book(){
		this.author ="Kamaran";
	}
	Book(String title, long isbn){
		this.isbn=123456;
	
		this.title=title;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	Write Book class that will have instance variables and 2 Constructors. 
		//While creating an object make sure:
		//Instance variables are being initialized
		//Both Constructors are being executed
		
		Book book1 = new Book("fictional stories",isbn);
		System.out.println("Title "+book1.title + " ISBN "+book1.isbn);
		
		Book book2 = new Book();
		System.out.println(book2.author);
		


	}

}
