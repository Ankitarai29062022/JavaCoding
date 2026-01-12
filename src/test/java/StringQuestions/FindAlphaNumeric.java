package StringQuestions;

import org.w3c.dom.DOMStringList;

public class FindAlphaNumeric {
    public static void main(String[] args) {
        String input = "Test123";  // Try changing this

        boolean isAlphanumeric = true;
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                isAlphanumeric = false;
                break;
            }
        }

        if (isAlphanumeric) {
            System.out.println("Input is alphanumeric");
        } else {
            System.out.println("Input is NOT alphanumeric");
        }
    }
}


