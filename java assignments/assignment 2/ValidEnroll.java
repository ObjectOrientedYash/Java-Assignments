import java.util.Scanner;
public class ValidEnroll
{
	static boolean validateString(String enrollString)
	{
		boolean valid = false;
		String yearString = enrollString.substring(0,2);
		String collegeString = enrollString.substring(2,5);
		String numString = enrollString.substring(5,7);
		String branchString = enrollString.substring(7,9);
		String rollString = enrollString.substring(9,12);
		int rollNumber = Integer.parseInt(rollString);
		if(yearString.equals("20") | yearString.equals("19") | yearString.equals("18") )
			if(collegeString.equals("047"))
				if(numString.equals("01") | numString.equals("31"))
					if(branchString.equals("07"))
						if(rollNumber >= 0 & rollNumber <= 600)
						{
							valid = true;
						}
		return valid;
		
	}
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean valid = false;
		valid = validateString(str);
		if(valid)
			System.out.println("Enrollment Number is valid.");
		else
			System.out.println("Invalid Enrollment Number.");
	}
}