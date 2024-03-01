package module1;

public class cmpt_poly {
	
	public static void send() {
		System.out.println("send option");
		
	}
	public  void send(int a) {
		System.out.println("send amount   "+a);
		
	}
//	public  void send(char c) {
//		System.out.println("send mesage  "+c);
//		
//	}
	
	public  double send(double a) {
		return a;
	
		
	}
	public static void main(String[] args) {
		new cmpt_poly().send('f');
	}



}
