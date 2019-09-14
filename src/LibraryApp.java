
public class LibraryApp {
	public boolean adminLoggedIn()
	{
		return true;
	}
	public boolean adminLogin( String password)
	{
		if(password.equals("password"))
		{
			return true;
			
		} 
		else
		{
			return false;
			
		}
	
	}

}
