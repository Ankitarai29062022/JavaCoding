package ExceptionPractice;

public class TryWithoutCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
		try {
			System.out.println(str.length());
		}
		finally {
			System.out.println("length found");
		}

	}

}
