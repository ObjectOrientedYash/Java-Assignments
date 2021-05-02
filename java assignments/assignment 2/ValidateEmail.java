import java.util.Scanner;

public class ValidateEmail {

    public static void main(String[] args) 
{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email address");
        String email = scan.next() ;
        boolean checkEndDot  = false;
        checkEndDot = email.endsWith(".");
        int indexOfAt = email.indexOf('@');
        int lastIndexOfAt = email.lastIndexOf('.');
        int countOfAt = 0;
        for (int i = 0; i < email.length(); i++)
 {
            if(email.charAt(i)=='@')
                countOfAt++; 
}
        String buffering = email.substring(email.indexOf('@')+1, email.length());
        int len = buffering.length();

        int countOfDotAfterAt = 0;
        for (int i=0; i < len; i++) 
{
            if(buffering.charAt(i)=='.')
                countOfDotAfterAt++; 
}
            String userName = email.substring(0, email.indexOf('@'));
            String domainName = email.substring(email.indexOf('@')+1, email.length());
                System.out.println("\n");   
               if ((countOfAt==1) && (userName.endsWith(".")==false)  && (countOfDotAfterAt ==1) &&   
                  ((indexOfAt+3) <= (lastIndexOfAt) && !checkEndDot)) 
{
                   System.out.println("\"Valid email address\"");}

               else 
{       
                        System.out.println("\n\"Invalid email address\""); 
}
                System.out.println("\n");
                System.out.println("User name: " +userName+ "\n" + "Domain name: " +domainName);
    }
}