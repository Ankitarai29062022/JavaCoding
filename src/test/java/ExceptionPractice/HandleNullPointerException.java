package ExceptionPractice;

public class HandleNullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		if(s!=null) {
			System.out.println(s.length());
		}
		else {
			System.out.println("String is null, cannot get length.");
		}
		

	}

}
