package CollectionCode;

import java.util.LinkedHashSet;
import java.util.Set;

public class TC01_RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Swiss";
	
        char m[]=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        Set<Character> st=new LinkedHashSet<>();
        for(char t:m) {
        	st.add(t);
        	
        }
        System.out.println(st);
        for(char n:st) {
        	sb.append(n);
        	        	
        }
        System.out.println(sb);
  
	}

}
