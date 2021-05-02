				import java.net.*; 
				import java.util.Scanner;
				import java.io.*; 
				public class URLOperation
				{  
				public static void main(String[] args) throws Exception
				{  
			System.out.println("Select any 1 option : ");	
			System.out.println("Select 1 for getting url details");
			System.out.println("Select 2 for getting data from URL ");
				Scanner sc = new Scanner(System.in);
				int ch = sc.nextInt();
				switch(ch)
				{
					case 1:
						try{  
						URL url=new URL("https://www.javatpoint.com/java-get-data-from-url");  
						System.out.println("Protocol: "+url.getProtocol());  
						System.out.println("Host Name: "+url.getHost());  
						System.out.println("Port Number: "+url.getPort());  
						System.out.println("File Name: "+url.getFile());  
						  
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
						break;
						case 2:
						URL demo = new URL("https://www.javatpoint.com/java-get-data-from-url");
							BufferedReader in = new BufferedReader(
							new InputStreamReader(demo.openStream()));
							String inputLine;
							while ((inputLine = in.readLine()) != null)
								System.out.println(inputLine);
							in.close();
						  
				}  
				}
				}