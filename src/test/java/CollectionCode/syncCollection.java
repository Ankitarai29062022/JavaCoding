package CollectionCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class syncCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lt=Collections.synchronizedList(new ArrayList<String>());
		lt.add("Anks");
		lt.add("prin");
		lt.add("shiv");
		
		synchronized(lt) {
		Iterator <String> itr=lt.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}
	}
}
