package CodePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatingWord {

	public static void main(String[] args) {
	String str="My name name is is is Ankita";
	String s[]=str.split(" ");
	Map<String,Integer> mp=new HashMap<String,Integer>();
	for (String m : s) {
		if (mp.containsKey(m)) {
			mp.put(m, mp.get(m) + 1);

		} else {
			mp.put(m, 1);
		}
		
	}
	System.out.println(mp);
	Set<String> s1=mp.keySet();
	for(String t:s1) {
	if(mp.get(t)>1) {
		System.out.println("Duplicate is"+mp.get(t) +"and" +t);
	}}
	
	}
	

}
