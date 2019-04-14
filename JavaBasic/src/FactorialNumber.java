
public class FactorialNumber {

	
	// non- recursive solution
	public static int factorial(int num){
		int fact =1;
		for (int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	// with recursive solution

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(factorial(4));
	}

}
