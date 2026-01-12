package StringQuestions;

public class findalphaNumericUsingRegularExpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SFJHKjuijo87";
		
		if(!str.contains("[^a-zA-Z0-9]")) {
			System.out.println("Notalpha");
			
		}

	}

}
