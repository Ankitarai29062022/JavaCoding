package CodePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SwissOutput {

	public static void main(String[] args) {
		String str="swiss";
		char c[]=str.toCharArray();
		Map<Character,Integer> mp=new HashMap<Character,Integer>();
		

		for(char m:c){
		if(mp.containsKey(m)){
			mp.put(m, mp.get(m)+1);
		}
		else {
			mp.put(m, 1);
		}
		
		}
		
		Set<Character> st=mp.keySet();
		for(char j:st) {
			
			if(mp.get(j)==1){
				System.out.println("Non repeating is "+j);
				break;
			}
		}

	}

}
