package Polymorphism;
import java.util.ArrayList;
import java.util.List;
class Book
{
	String title;
	String author;
	
	Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	void showBook()
	{
		System.out.println("Book: "+title+" by "+author);
	}
}
class Library
{
	String name;
	List<Book> books;
	
	Library(String name,List<Book> books)
	{
		this.name=name;
		this.books=books;
	}
	
	void showLibrary()
	{
		System.out.println("Library: "+name);
		for (Book b:books)
		{
			b.showBook();
		}
	}
}
public class Aggregation {

	public static void main(String[] args) 
	{
		Book b1=new Book("Java Basics","James Gosling");
		Book b2=new Book("Effective Java","Joshua Bloch");
		Book b3=new Book("Clean Code","Robert C.Martin");
		
		List<Book> bookList=new ArrayList<>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		Library library=new Library("city Library",bookList);
		library.showLibrary();
	}

}