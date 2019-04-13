
public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test1();
		divison();
	}

	//
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally block");
		}
	}

	public static void divison() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;

		} catch (ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("inside divison");
		}

		finally {
			System.out.println("finally block call after the exception");
		}
	}
}
