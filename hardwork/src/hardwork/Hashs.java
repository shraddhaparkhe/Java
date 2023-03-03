package hardwork;

import java.util.HashSet;
import java.util.Iterator;

public class Hashs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> hs = new HashSet<String>();
hs.add("US");
hs.add("Canada");
hs.add("myra");
System.out.println(hs);
Iterator<String> s =hs.iterator();
System.out.println(s.next());
System.out.println(s.next());
	}

}
