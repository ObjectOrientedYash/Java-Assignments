import java.io.*;
import java.util.Scanner;
class DivisibleCheck {
	static int countDivisibles(int A, int B, int M)
	{
		int counter = 0;
		for (int i = A; i <= B; i++)
			if (i % M == 0)
				counter++;

		return counter;
	}
	public static void main(String[] args)
	{	
		int A,B ;
		int M;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		A = s.nextInt();
		B = s.nextInt();
		System.out.println("Enter the number against which we check divisiblity ");
		M = s.nextInt();
		System.out.println(countDivisibles(A, B, M));
	}
}

