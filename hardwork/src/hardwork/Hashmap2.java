package hardwork;

import java.util.HashSet;
import java.util.Iterator;

public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("US");
		hs.add("Canada");
		hs.add("America");
		hs.add("America");
		hs.add("he");
		hs.add("she");
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		Iterator<String> i =hs.iterator(); 
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
	}

}
