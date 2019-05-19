

public class FunctionOrMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOrMethod obj = new FunctionOrMethod(); 
		
		obj.test();
		
		int l = obj.pqr();
		System.out.println(l);
	}


		public void test() {
			System.out.println("testmethod");
		}
		
		public int pqr() {
			System.out.println("pqr method");
			int p =10;
			int q =20;
			int r = p+q;
			
			return r;
		}
	
}
