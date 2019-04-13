import java.util.ArrayList;

public class Array {

	// size of array is fixed so to overcome that we use arraylist or dynamic array
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		ar.add("tom");
		ar.add("hello");
		ar.add(12.8);
		ar.add('h');
		
		System.out.println("array list containing:" +ar);
		
		ar.remove(8);
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		
		// currently we can pass any datatype to restrict that we can user<>
		
		
		
		
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
			
		}
		
		ArrayList<Integer> ar1 =new ArrayList<Integer>();
		
	ar1.add(1);
	//ar1.add("a");
	
		ArrayList<String> ar2 = new ArrayList<String>();
		//ar2.add(9);
		ar2.add("c");
	}

}
