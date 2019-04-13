
public class ConstructorConceptandItsOverloading {

	public ConstructorConceptandItsOverloading() {
		System.out.println("Default Constructor");
	}

	public ConstructorConceptandItsOverloading(int i) {
		System.out.println("constructor with single parameter");
		System.out.println("Default Constructor");
	}

	public ConstructorConceptandItsOverloading(int i, int j) {
		System.out.println("constrctor with two parameter");
		System.out.println("print value of i:" + i);
		System.out.println("print value of j:" + j);
	}

	public static void main(String[] args) {
		ConstructorConceptandItsOverloading obj = new ConstructorConceptandItsOverloading();
		ConstructorConceptandItsOverloading obj1 = new ConstructorConceptandItsOverloading(20);
		ConstructorConceptandItsOverloading obj2 = new ConstructorConceptandItsOverloading(10, 20);

	}

}
