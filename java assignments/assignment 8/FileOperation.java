import java.util.Scanner;
import java.io.*;	
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.IOException;
public class FileOperation {
    public static void main(String[] args) {
			
			 System.out.println("Select any 1 option : ");
			 System.out.println("Select 1 for file read ");
			 System.out.println("Select 2 for file write");
			 System.out.println("Select 3 for append operation ");
			  Scanner sc = new Scanner(System.in);
			 int ch = sc.nextInt();	
			 switch(ch)
			 {
				 case 1:
					try {
						System.out.println("reading movie names from movies.txt");
						FileReader reader = new FileReader("movies.txt");
						int character;
						while ((character = reader.read()) != -1) {
							System.out.print((char) character);
						}
						reader.close();
					} 
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					case 2:
					try 
					{
					FileWriter writer = new FileWriter("general.txt", true);
					writer.write("Hello World");
					writer.write("\r\n");  
					writer.write("Good Bye!");
					writer.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				case 3:
				 try {
			 String data = " This is a appended text.";
			 FileWriter fileWritter = new FileWriter("general.txt",true);
			 BufferedWriter bw = new BufferedWriter(fileWritter);
			 bw.write(data);
			 bw.close();
			 System.out.println("Done");
		  } 
		  catch(IOException e)
		  {
			 e.printStackTrace();
		}
		}
    }
 
}