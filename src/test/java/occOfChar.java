import java.util.HashMap;
import java.util.Map;

public class occOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="java java jaba java";
		String[] str=s.split(" ");
		Map<String,Integer> mp=new HashMap<String,Integer>();
		for(String i:str) {
		if(mp.containsKey(i)) {
			mp.put(i, mp.get(i)+1);
		}
		else {
			mp.put(i, 1);
		}
		}
		System.out.println(mp);
		System.out.println(mp.entrySet());
		
		for(Map.Entry<String,Integer> mop:mp.entrySet()) {
			if(mop.getValue()>1) {
				System.out.println(mop.getKey()+" Duplicate is " + mop.getValue());
			//System.out.println("value of key "+ );
			}
		}
	}

}
