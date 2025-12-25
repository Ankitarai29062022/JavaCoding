package CodePractice;

public class LengthofUpperCaseLowerCase {

	public static void main(String[] args) {
		
		String str="#GeekOr@EEks07";
		int upper = 0;
		int lower = 0;
		int Digi = 0;
		int special = 0;
		
		char m[]=str.toCharArray();
		for(char n:m) {
			
	    if(Character.isUpperCase(n)) {
	    	
		upper++;
		
	}
	    else if(Character.isLowerCase(n)) {
	    	lower++;
	    }
	    
	    else if(Character.isDigit(n)) {
	    	Digi++;
	    }
	    
	    else {
	    	special++;
	    }
	    
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(Digi);
		System.out.println(special);
	

	}

}
