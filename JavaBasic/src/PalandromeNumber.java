
public class PalandromeNumber {

	public static void palandrome(int num) {
		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;

		}
		if (t == sum) {
			System.out.println("numer is palandrome");

		} else {
			System.out.println("number is not palandrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palandrome(151);
	}

}
