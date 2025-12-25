package CodePractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Coll_HashMap {

	public static void main(String[] args) {
	HashMap<Integer,String> mp=new HashMap<Integer,String>();
	mp.put(1,"Ankita");
	mp.put(1,"Princi");
	mp.put(2,null);
	mp.put(null,null);
	mp.put(null,"Pinki");
System.out.println(mp);
System.out.println(mp.get(2));

Iterator<Integer> itr=mp.keySet().iterator();
while(itr.hasNext()) {
	Integer key=itr.next();
	System.out.println(key);
}
	}

}
