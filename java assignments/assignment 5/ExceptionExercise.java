class GException extends Exception {
	GException(String s) { super(s); }
}
class FException extends Exception {
	FException(String s) 
	{
		super(s); 
	}
}
public class ExceptionExercise{
	static void f() {
		try {
			try {
				g();
			} catch(GException ge) {
				System.out.println("Caught GException in f inner try");
				throw new FException("from f(), inner try");
			}
		} catch(FException he) {
			System.out.println("Caught FException in f() outer try");
			
		}
	}
	static void g() throws GException {
		throw new GException("from g()");
	}
	public static void main(String[] args) {
		f();
	}	
}