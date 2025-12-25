package CollectionCode;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;



public class Hashtavleentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> ht=new Hashtable<Integer, String>();
		ht.put(101,"Anks");
		ht.put(102, "Princi");
		ht.put(103, "");
		System.out.println(ht);
		
		
		for(Entry m:ht.entrySet()){
			System.out.println(m.getKey()+"  "+m.getValue());
			
		}
		int maxcount=0;
		char maxoccchar=0;
		
		for(Map.Entry<Integer, String> n:ht.entrySet()) {
			if(n.getValue().isEmpty()) {
				n.setValue("BLANK");
				System.out.println(n.getKey()+" "+n.getValue());
			}
			System.out.println(n);
		}
		
		
	}

}
