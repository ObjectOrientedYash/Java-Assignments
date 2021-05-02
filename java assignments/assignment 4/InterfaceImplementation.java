interface P{
	int p = 0;
	public void methodP();
}
interface P1 extends P{
	int p1 = 1;
	public void methodP1();
}
interface P2 extends P{
	int p2 = 2;		
	public void methodP2();
}
interface P12 extends P1, P2{
	int p12 = 12;
	public void methodP12();
}
class Q implements P12{
	public void methodP(){ 
		System.out.println("This is P: " + p);
	}
	public void methodP1(){ 
		System.out.println("This is P1: " + p1);
	}
	public void methodP2(){ 
		System.out.println("This is P2: " + p2);
	}
	public void methodP12(){ 
		System.out.println("This is P12: " + p12);
	}
}
class InterfaceImplementation{
	public static void main(String args[]){
		Q obj = new Q();
		obj.methodP();
		obj.methodP1();
		obj.methodP2();
		obj.methodP12();
	}
}