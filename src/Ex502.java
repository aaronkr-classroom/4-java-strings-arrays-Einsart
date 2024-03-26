
public class Ex502 {
	public static double add(double a, double b) {return a+b;	}
	public static double sub(double a, double b) {return a - b;	}
	public static double mult(double a, double b) {return a * b;	}
	public static double div(double a, double b) {return a / b;	}
	public static double max(double a, double b) {
		if (a >= b) return a;
		else return b;
	}
	
	public static double min(double a, double b) {
		if (a <= b) return a;
		else return b;
	}
	
	
	// factorial
	public static void factorial(double a) {
		int result = 1;
		for (double i = 1; i <= a; i++) {
			result *= i;
		}
		System.out.println("Factoral of " + a + "!" + result);
	}
	
	//circle
	public static void circ(double a) {
		System.out.println("Pizza circ: " + a + "inches"
				+ 2 * a * 3.141592
				);
	}
	public static void circ(int a) {
		System.out.println("Pizza circ: " + a + "inches"
				+ 2 * a * 3.141592
				);
	}
	
	public static void area(double a) {
		System.out.println(
				"Pizza area: " + a + "inches"
				+ a * a * 3.141592
				);
	}
	
	public static void area(int a) {
		System.out.println(
				"Pizza area: " + a + "inches"
				+ a * a * 3.141592
				);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 15;
		double b = 7.5;
		
		factorial(a);
		factorial(b);
		
		
		System.out.println("carculator program: ");
		System.out.println("Add: " + a + "+" + b + "=" + add(a,b));
		System.out.println("Sub: " + a + "-" + b + "=" + sub(a,b));
		System.out.println("Mul: " + a + "*" + b + "=" + mult(a,b));
		System.out.println("Div: " + a + "/" + b + "=" + div(a,b));
		
		System.out.println("Max(" + a + "," + b + "):" + max(a,b));
		System.out.println("Min(" + a + "," + b + "):" + min(a,b));
		
		
		// Circle 계산
		circ(a);
		area(a);
		
		circ(12);
		circ(1.234567);
		
		float c = 12.345f;
		 
	}

}











