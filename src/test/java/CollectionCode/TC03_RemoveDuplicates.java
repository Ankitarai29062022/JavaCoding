package CollectionCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TC03_RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="My name is Ankita Rai name is is";
		Map<String,Integer> mp=new HashMap<String,Integer>();
		String st[]=str.split(" ");
		for(String t:st) {
		if(mp.containsKey(t)) {
			mp.put(t, mp.get(t)+1);
			
		}
		
		else {
			mp.put(t, 1);
		}
		}
		
		System.out.println(mp);
		
		String maxVal="";
		int maxoc=Integer.MIN_VALUE;
		String smaxVal="";
		int smaxoc=Integer.MIN_VALUE;
		
		for(Entry<String,Integer> entry:mp.entrySet()) {
			
			if(entry.getValue()>maxoc) {
				smaxoc=maxoc;
				smaxVal=maxVal;
				maxoc=entry.getValue();
				maxVal=entry.getKey();}
				
				else if(entry.getValue()>smaxoc && entry.getValue()<maxoc) {
					smaxoc=entry.getValue();;
					smaxVal=entry.getKey();;
					
					
				}
				
			    }
		System.out.println(maxVal +" value "+maxoc);
		System.out.println(smaxVal +" value "+smaxoc);
		}
		
//		Set<String> st3=mp.keySet();
//		for(String m:st3) {
//			if(mp.get(m)>maxoc) {
//				smaxoc=maxoc;
//				smaxVal=maxVal;
//				maxoc=mp.get(m);
//				maxVal=m;
//				
//			    }
//			
//			else if(mp.get(m)>smaxoc && mp.get(m)<maxoc) {
//				smaxoc=mp.get(m);;
//				smaxVal=m;
//				
//				
//			}
//			}
//		System.out.println(maxVal +"value "+maxoc);
//		System.out.println(smaxVal +"value "+smaxoc);

	

}
