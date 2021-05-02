import java.util.Scanner;

public class CurrencyConvert {

	public static void main(String[] args) {
		float dollars;
		float r;
		System.out.println("Select an 1 option");
		System.out.println("Select 1 for dollars to INR .");
		System.out.println("Select 2 for INR to dollars .");
		Scanner n = new Scanner(System.in);
		int ch = n.nextInt();
		switch(ch)
		{ 
		case 1:
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter dollars:");
		dollars = in.nextLong();
		float rupees = dollars * 75;
		System.out.println(rupees + " Rupees");
		break;
		
		case 2:
		Scanner nm = new Scanner(System.in);
		System.out.println("Please enter rupees:");
		rupees = nm.nextLong();
		float dol = r / 75;
		System.out.println(dol + " Dollars");
		break;
		
	}
}
}