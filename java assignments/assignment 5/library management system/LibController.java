import java.util.Date;
import java.util.Scanner;
public class LibController
{	
	private static int sid,bookid;
	private static Scanner sc = new Scanner(System.in);

	public static void getInfo()
	{		
		System.out.print("Enter book id : ");
		bookid = sc.nextInt();
		System.out.print("Enter Student id : ");
		sid = sc.nextInt();
	}

	public static void issueBook()
	{	
		for(int i=0;i<5;i++)
		{
			if(LibData.b[i].getid() == bookid)
			{
				if(LibData.s[sid].getlimit() > 0)
				{
					if(LibData.b[i].getavail() >= 1)
					{
						LibData.b[i].setavail(LibData.b[i].getavail()-1);
						LibData.b[i].setIsueDate(new Date());
						LibData.s[sid].setlimit(0);
						System.out.println("Book Issued");
					}
					else
						System.out.println("Book is not available");
				}
				else
					System.out.println("Student issue Book limit is over...");
			}
		}
	}

	public static void returnBook()
	{	
		int r = 0;
		for(int i=0;i<5;i++)
		{
			if(LibData.b[i].getid() == bookid)
			{	
				LibData.b[i].setavail(LibData.b[i].getavail()+1);
				LibData.b[i].setReturnDate(new Date());
				LibData.s[sid].setlimit(1);
				r = 1;
			}
		}
		if (r == 1)			
			System.out.println("Book Returned");
		else
			System.out.println("No Book Found");
	}

	public static void checkBalance(int c)
	{	

		if (c==1)
		{
			System.out.print("Enter Student id : ");
			int stui = sc.nextInt();
			for(int i=0;i<5;i++)
			{
				if(LibData.s[i].getid() == stui)
				{
					System.out.println("Limit : " + LibData.s[i].getlimit());
				}
			}
		}
		else
		{
			System.out.print("Enter Book id : ");
			int booki = sc.nextInt();
			for(int i=0;i<5;i++)
			{
				if(LibData.b[i].getid() == booki)
				{
					System.out.println("Available Book : " + LibData.b[i].getavail());
				}
			}
		}
	}
}