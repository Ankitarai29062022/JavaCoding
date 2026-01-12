package CollectionCode;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMapPlayaround {

	public static void main(String[] args) {
	HashMap<String,String> hm=new HashMap<String,String>();
	hm.put("Name", "Ankita");
	hm.put("Roll No", "24");
	hm.put(null, null);
	hm.put(null, "Anks");
System.out.println(hm);
System.out.println(hm.get(null));

Iterator<String> itr=hm.keySet().iterator();
while(itr.hasNext()) {
	String key=itr.next();
	System.out.println(key);
	System.out.println("************************");
	String value=hm.get(key);
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
	System.out.println(value);
	
}

//Hashtable<String,String> hm1=new Hashtable<String,String>();
//hm1.put(null, null);
//System.out.println(hm);
	}

}
