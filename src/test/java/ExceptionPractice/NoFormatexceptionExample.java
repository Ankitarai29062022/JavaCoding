package ExceptionPractice;

public class NoFormatexceptionExample {

	public static void main(String[] args) {
		String s="Ankita";
		
		try {
			int i=Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException caught: "+e.getMessage());
		}
	
	}

}
