import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<String>();

		ll.add("tom");
		ll.add("herry");
		ll.add("jery");
		System.out.println(ll);

		ll.addFirst("auto");

		ll.addLast("bot");
		System.out.println(ll.size());

		ll.removeFirst();
		// for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("***********");
		// advance for

		for (String str : ll) {
			System.out.println(str);
		}

		// iterator

		System.out.println("using iterator ******");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// while loop
		System.out.println("using while ********");

		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
