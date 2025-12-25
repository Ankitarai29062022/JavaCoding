
public class MoveVowelLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Second most repeating character
		// • Move vowels to the left, consonants in the middle, special chars to the right
		
		String str= "Ankit$%#";
		
	char m[]=str.toCharArray();
	String revVow="";
	String revCon="";
	String speclchar="";
	String n="aeiouAEIOU";
	
for(char t:m) {
	if(Character.isAlphabetic(t)) {
	
	if(n.contains(String.valueOf(t))) {

		revVow=revVow+t;
		
	}
	else {
		revCon=revCon+t;
	}
	
	
		
	}
	else {
		speclchar=speclchar+t;
}}
System.out.println(revVow+revCon+speclchar);
System.out.println(revCon);
System.out.println(speclchar);
	}

}
