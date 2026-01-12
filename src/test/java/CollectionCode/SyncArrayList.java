package CollectionCode;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArrayList {

	public static void main(String[] args) {
	CopyOnWriteArrayList <String> lt=new CopyOnWriteArrayList<String>();
	lt.add("Anks");
	lt.add("prin");
	lt.add("shiv");
	
	
	Iterator <String> itr=lt.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	

	}

}
