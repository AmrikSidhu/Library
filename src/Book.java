
public class Book {
	private String signature;
	private String title;
	private String author;
	
	
	public Book(String signature,String title,String author)
	{
		this.signature = signature;
		this.title = title;
		this.author = author;
	}
	
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
