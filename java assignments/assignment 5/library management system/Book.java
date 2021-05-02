import java.util.Date;
public class Book
{
	private int id,sid;
	private float price;	
	private Date returnDate;
	private Date isueDate;
	private int avail;
	private String title, author, pub;

	Book(){}

	Book(int id, String title, String author, String pub, float price, int avail)
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.pub = pub;
		this.price = price;
		this.avail = avail;
	}

	public void setavail(int avail)
	{	
		this.avail = avail;	
	}

	public int getid()
	{	
		return id;	
	}

	public int getavail()
	{	
		return avail;	
	}

	public String gettitle()
	{	
		return title;	
	}

	public String getauthor()
	{	
		return author;	
	}

	public String getpub()
	{	
		return pub;	
	}

	public float getprice()
	{	
		return price;	
	}

	public java.util.Date getIsueDate()
	{	
		return isueDate;	
	}
	public java.util.Date getReturnDate()
	{	
		return returnDate;	
	}

	public void setIsueDate(Date d)
	{
		isueDate = d;
	}

	public void setReturnDate(Date d)
	{
		returnDate = d;
	}
}