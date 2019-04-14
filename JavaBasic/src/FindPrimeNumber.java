
public class FindPrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(12));
getprime(19);
	
}
	
	
	public static boolean isPrimeNumber(int num) {
		if (num<=1) {
			return false;
			//System.out.println("number is not prime");
		}
		
		for (int i=2;i<num;i++) {
			if (num % i==0) {
				return false;
				//System.out.println("number is  prime");
			}
		}
		return true;
			//System.out.println("number is not prime");
	}
	
	
	public static void getprime(int num) {
		for (int i=2; i<num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i + "");
			}
				
		}
	}
	
	

}
