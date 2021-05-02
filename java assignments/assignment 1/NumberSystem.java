import java.util.Scanner;
import java.util.*;
class  NumberSystem
{
  public static void main(String[] args) 
  {
	  System.out.println("Select any 1 option : ");
	  System.out.println("Select 1 for decimal to binary ");
	  System.out.println("Select 2 for binary to decimal ");
    Scanner sc = new Scanner(System.in);
	int ch = sc.nextInt();
	switch(ch)
	{ 
	case 1:
	System.out.println("Enter decimal number ");
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
    long binary = convertDecimalToBinary(num);
    System.out.println("\n" + num + " = " + binary);
	break;
	
	case 2:
	System.out.println("Enter binary number ");
	Scanner se = new Scanner(System.in);
	int nums = se.nextInt();
    Stack<Integer> stack = new Stack<Integer>();
    while (nums != 0)
    {
      int d = nums % 2;
      stack.push(d);
      nums /= 2;
    } 
    System.out.print("\nBinary representation is:");
    while (!(stack.isEmpty() ))
    {
      System.out.print(stack.pop());
    }
    System.out.println();
	break;
    }
  }
  public static long convertDecimalToBinary(int n) {
    long binaryNumber = 0;
    int remainder, i = 1, step = 1;

    while (n!=0) {
      remainder = n % 2;
        System.out.println("Step " + step++ + ": " + n + "/2");
        System.out.println("Quotient = " + n/2 + ", Remainder = " + remainder);
        n /= 2;
        binaryNumber += remainder * i;
        i *= 10;
    }
    
    return binaryNumber;
    }
}