
public class ReverseString {

	public static void main(String[] args) {
		//	ex-abcd#$%a(*12^
			//3.Reverse a string without affecting special character?
		String input = "ex-abcd#$%a(*12^";
        char[] arr = input.toCharArray();

        int left = 0, len = arr.length - 1;

        while (left < len) {
            // Skip non-alphabetic characters from left
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // Skip non-alphabetic characters from right
            else if (!Character.isLetter(arr[len])) {
                len--;
            }
            // Swap alphabetic characters
            else {
                char temp = arr[left];
                arr[left] = arr[len];
                arr[len] = temp;
                left++;
                len--;
            }
        }

		
		

	}

}
