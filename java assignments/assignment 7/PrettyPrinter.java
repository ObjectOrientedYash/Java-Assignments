class Printer{
    synchronized public void print(String msg){
        System.out.print("[");
        try{
            Thread.sleep(500);
        }catch(InterruptedException ie){
            System.out.println("Interrupted.");
        }
        System.out.print(msg);
        System.out.print("]\n");
    }
}

class  User implements Runnable{
    Printer p;
    String message;
    Thread t;
    User(String printJob, Printer p){
        this.p = p;
        message = printJob;
        t = new Thread(this);
    }
    public void run(){
        p.print(message);
    }
}

public class PrettyPrinter
{
    public static void main(String[] args){
	        Printer p = new Printer();
            User u1 = new User("This",p);
            User u2 = new User("is",p);
            User u3 = new User("coder",p);
			User u4 = new User("programmer",p);
			User u5 = new User("technophile",p);
			User u6 = new User("sopohomore",p);
			User u7 = new User("developer",p);
            u1.t.start();
        try
		{
            u1.t.join();
        }
		catch(InterruptedException ie)
		{
            ie.printStackTrace();
        }
            u2.t.start();
            try
			{
                u2.t.join();
            }
			catch(InterruptedException ie)
			{
                ie.printStackTrace();
            }

            u3.t.start();
            try
			{
                u3.t.join();
            }
			catch(InterruptedException ie)
			{
                ie.printStackTrace();
            }
			
            u4.t.start();
            try
			{
                u4.t.join();
            }
			catch(InterruptedException ie)
			{
                ie.printStackTrace();
            }
            
            u5.t.start();
            try
			{
                u5.t.join();
            }
			catch(InterruptedException ie)
			{
                ie.printStackTrace();
            }
			
            u6.t.start();
            try
			{
                u6.t.join();
            }
			catch(InterruptedException ie)
			{
                ie.printStackTrace();
            }
			
            u7.t.start();
            try
			{
                u7.t.join();
            }
			catch(InterruptedException ie)
			{
                ie.printStackTrace();
            }
        }
    }