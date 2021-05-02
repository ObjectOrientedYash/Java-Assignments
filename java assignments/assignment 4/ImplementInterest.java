import java.util.*;
interface Interest{
	void interest(double principal, float rateOfInterest, int numberOfYears);
}
class SimpleInterest implements Interest
{
	public void interest(double principal, float rateOfInterest, int numberOfYears)
	{
		double interest = principal * rateOfInterest * numberOfYears;
		System.out.println(interest);
	}
}

class CompoundInterest implements Interest
{
public void interest(double principal, float rateOfInterest, int numberOfYears)
{
double CI = principle *(Math.pow((1 + rateOfInterest/ 100), numberOfYears))	;	
System.out.println(CI);	
}	
}
class InterestImplement
{
	public static void main(String args[]){
			Scanner sc  = new Scanner(System.in);
			System.out.printlnt("Enter choice :");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
			SimpleInterest si = new SimpleInterest();
			si.interest(5000d,5f,5);
			break;
			 
			case 2:
			CompoundInterest ci = new CompoundInterest();
			ci.interest(5000,5,10);
			break;
			}
	}
}
