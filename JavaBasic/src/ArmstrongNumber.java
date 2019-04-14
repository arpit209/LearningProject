
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isArmstrongNumber(153);
	}

	public static void isArmstrongNumber (int num) {
		System.out.println("insert number is:" + num);
		int cube =0;
		int r;
		int t;
		
		t =num;
		
		while (num>0) {
		r = num%10;
		num = num/ 10;
		cube =cube + (r*r*r);
	}
	
	if (num == cube) {
		System.out.println("number is armstrong");
	} else {
		System.out.println("number is not armstrong");
	}
	}
	
}
