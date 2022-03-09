package recursion;

public class Recursion {

	//recursion - when something is defined in terms of itself. - wikipedia
	//			  Apply the results of a procedure to the the same procedure
	//			  A recursive method calls itself. Can be used as a subsitution for interation.
	
	//            advantages: easier to write and debug
	//            disadvantages: slower and uses more memory
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// walk(5);
		
		// System.out.println(factorial(7));
		System.out.println(power(2, 8));
		

	}

	private static int power(int base, int exponent) {
		// TODO Auto-generated method stub
		if(exponent < 1) return 1;
		return base * power(base, exponent - 1);
		
	}

	private static int factorial(int num) {
		// TODO Auto-generated method stub
		if(num < 1) return 1;
		return num * factorial(num - 1);
		
		
	}

	private static void walk(int steps) {
		// TODO Auto-generated method stub
		if(steps < 1) return;
		System.out.println("you have taken " + steps + " steps");
		walk(steps - 1);
	}

}
