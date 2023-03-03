package hardwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Has {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> hp= new HashMap<Integer,String>();
hp.put(1, "Shraddha");
hp.put(2, "Deep");
hp.put(0, "Ft");
hp.put(5, "shraddha");
System.out.println(hp);

Set sn=hp.entrySet();
Iterator it=sn.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	Entry mp=(Map.Entry)it.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());	
}
	}

}
