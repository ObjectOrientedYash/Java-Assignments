import java.util.Scanner;
public class LibView
{
	static void menu()
	{
		int ch;
		String c;

  		System.out.println("1. IssueBook \n2. ReturnBook \n3. CheckBalance of Book Available \n4. CheckBalance of Student Limit");
  		Scanner sc = new Scanner(System.in);
  		

  		do
  		{
  			System.out.println("Enter Choice: ");
  			ch = sc.nextInt();
	  		switch(ch)
		  	{
		  		case 1:
		  		{
		  			LibController.getInfo();
		  			LibController.issueBook();
		  			break;
		  		}
		  		case 2:
				{
		  			LibController.getInfo();
		  			LibController.returnBook();
		  			break;
		  		}
		  		case 3:
		  		{
		  			LibController.checkBalance(0);
		  			break;
		  		}
		  		case 4:
		  		{
		  			LibController.checkBalance(1);
		  			break;
		  		}
		  		default:
		  			System.out.println("Wrong Choice");
		  	}
		  	System.out.println("Do you want to do another task? y/n : ");
		  	c = sc.next();
		}while(c.equalsIgnoreCase("y"));

	}
	public static void main(String[] args) 
	{	
		LibData.setLibData();
		LibView.menu();
	}
}