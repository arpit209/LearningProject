
public class MethodOverloading {
// Method overloading - when we pass different argument or parameter against same class that is called
	public static void main(int p) {
		// TODO Auto-generated method stub

}
	public static void main(int o, int g) {
	System.out.println("main method overriding");
	}
	
	//same method with same no. of argument are not allowed
	// you can not create method inside a method
	// we can overload main method as well
	public void sum() //0 input parameter
	{
		System.out.println("zero input");
	}
	public void sum(int i) //one input parameter
	{
		System.out.println("one input");
		System.out.println(i);
	}
	public void sum(int k, int j) //two input parameter
	{
		System.out.println("two input ");
		System.out.println(k+j);
		
	}
	
	
}
