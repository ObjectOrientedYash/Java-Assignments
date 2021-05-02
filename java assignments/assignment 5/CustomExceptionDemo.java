import java.util.*;
public class CustomExceptionDemo
{
static void valid(int age)throws InvalidAgeException
{
if(age<18)
{
throw new InvalidAgeException("Access Denied");
}
else
{
System.out.println("Access Granted");
}
}
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age");
	int age = sc.nextInt();
	try
	{
		valid(age);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
