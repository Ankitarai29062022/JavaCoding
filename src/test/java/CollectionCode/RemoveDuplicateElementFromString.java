package CollectionCode;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateElementFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SeleniumJavaj";
	
		StringBuilder sb=new StringBuilder();
		char m[]=str.toCharArray();
		Set<Character> st=new TreeSet();
		for(char t:m) {
			st.add(t);
		}
		System.out.println(st);
		for(char o:st) {
			
			sb=sb.append(o);
			
		}
		
		System.out.println(sb);
		
		

	}

}
