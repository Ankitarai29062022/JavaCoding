package CollectionCode;
import java.util.*;

public class RemoveDuplicatesWithMap {
    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 7, 7, 5, 9, 4};

        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Map: " + freqMap);

        // Convert keys back to array
        int[] uniqueArr = freqMap.keySet().stream().mapToInt(Integer::intValue).toArray();

        System.out.print("Array without duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}
