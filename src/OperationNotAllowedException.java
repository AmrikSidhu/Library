
public class OperationNotAllowedException extends Exception {
	public String getMessage()
	{
		return "Add book operation not allowed if not admin.";
	}
	public Object getOperation() 
	{
		return "Add book";
	}

}
