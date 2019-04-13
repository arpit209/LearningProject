import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable hr = new Hashtable();
		
		hr.put("a", 100);
		hr.put(1, "tom");
		
		System.out.println(hr.size());
		
		System.out.println(hr.get(1));
		
		hr.put(2, 200);
		hr.put("c", "cat");
		
		System.out.println(hr.get("c"));
		
		//for (int i=0; i<hr.size(); i++) {
		//System.out.println(hr.get(i));}
		
		
		Hashtable<Integer,Integer> hr1 = new Hashtable<Integer,Integer>();
		//hr1.put("o", 500);
		//hr1.put(2, "ck");
		hr1.put(3, 3);
		}
	}


