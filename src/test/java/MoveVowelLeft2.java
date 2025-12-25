
public class MoveVowelLeft2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "ex-abcd#$%a(*12^";
        String vowels = "";
        String consonants = "";
        String specials = "";

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowels += ch;   // Collect vowels
                } else {
                    consonants += ch; // Collect consonants
                }
            } else {
                specials += ch;   // Collect special chars/digits
            }
        }

        String output = vowels + consonants + specials;
        System.out.println("Output: " + output);
    }

    // Helper method to check vowel
    private static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }
}


	


