package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		B[] bs = new B[3];
		
		bs[0] = new B();
		bs[1] = new A(); 
		bs[2] = new C();
		
		naiveprinter(bs);

	}

	private static void naiveprinter(B[] bs) {
		for (int i = 0; i < bs.length; i++) {
			
			bs[i].print();
			
		}
		
	}

}
