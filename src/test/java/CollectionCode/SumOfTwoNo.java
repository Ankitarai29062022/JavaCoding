package CollectionCode;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNo {

public static int[] test(String[] args) {
        
        int t[] = {5, 4, 6, 4, 2};
        int target = 8;
        
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < t.length; i++) {
            int diff = target - t[i];
            
            if (mp.containsKey(diff)) {
                return new int[] { i, mp.get(diff) };
            }
            
            mp.put(t[i], i);  // store value → index
        }
        
        return null; // if no pair found
    }
    
    public static void main(String[] args) {
        int[] result = test(args);
        if(result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}
