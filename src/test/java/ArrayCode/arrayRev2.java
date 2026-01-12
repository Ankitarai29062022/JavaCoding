package ArrayCode;

public class arrayRev2 {
    public static void main(String[] args) {
        String arr[] = {"one","two","three","four","five"};

        for (int i = 0; i < arr.length; i++) {
            // Reverse only "two" and "four"
            if (arr[i].equals("two") || arr[i].equals("four")) {
                StringBuffer bf = new StringBuffer(arr[i]); // initialize with current word
                arr[i] = bf.reverse().toString();
            }
        }

        // Print the result
        for (String s : arr) {
            System.out.print("\"" + s + "\" ");
        }
    }
}