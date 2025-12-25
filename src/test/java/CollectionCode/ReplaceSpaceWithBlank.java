package CollectionCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReplaceSpaceWithBlank {

	public static void main(String[] args) {

   String str="Selenium java";
   
   Map<String,Integer> map=new HashMap<String,Integer>();
   char c[]=str.toCharArray();
   for (char ch : c) {
       String key;
       if (ch == ' ') {
           key = "BLANK";   // replace space with BLANK
       } else {
           key = String.valueOf(ch);
       }

       if (map.containsKey(key)) {
           map.put(key, map.get(key) + 1);
       } else {
           map.put(key, 1);
       }
	   
   }	
   System.out.println(map);
	   }	

}
