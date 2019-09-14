
public class LibraryApp {
	private boolean isLoggedIn = false;
	
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

}
