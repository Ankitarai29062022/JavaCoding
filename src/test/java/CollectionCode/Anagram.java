package CollectionCode;

import java.util.HashMap;

public class Anagram {

    public static boolean isAnagram(String s1, String s2) {
        // Step 1: Quick length check
        if (s1.length() != s2.length()) {
            return false;
        }

        // Step 2: Build frequency map for s1
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Decrease counts using s2
        for (char ch : s2.toCharArray()) {
            if (!charCount.containsKey(ch)) {
                return false;
            }
            charCount.put(ch, charCount.get(ch) - 1);
            if (charCount.get(ch) < 0) {
                return false;
            }
        }

        // Step 4: Verify all counts are zero
        for (int count : charCount.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // ✅ Test cases
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("hello", "world"));     // false
    }
}
