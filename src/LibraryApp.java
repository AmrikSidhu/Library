import java.util.ArrayList;
import java.util.List;

public class LibraryApp {
	private boolean isLoggedIn = false;
	private List<Book> books =  new ArrayList<Book>();
	
	// constructor for class.
	public LibraryApp()
	{
		
	}
	public boolean adminLoggedIn()
	{
		return this.isLoggedIn;
	}
	public boolean adminLogin( String password)
	{
		if(password.equals("adminadmin"))
		{
			return this.isLoggedIn = true;
			
		} 
		else
		{
			return this.isLoggedIn = false;
			
		}
	
	}
	public List<Book> getBooks()
	{
		return this.books;
	}
	public void setBooks(List<Book> book)
	{
		//return this.books;
	}
	public void addBook(Book book) throws OperationNotAllowedException
	{
		if (isLoggedIn == true)
		{
	this.books.add(book);	
	}
		else
		{
			throw new OperationNotAllowedException();
		}
	}
//	public void setBooks(List<Book> books2) {
//		// TODO Auto-generated method stub
//		
//	}
	public List<Book> search(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
