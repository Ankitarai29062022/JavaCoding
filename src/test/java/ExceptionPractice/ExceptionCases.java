package ExceptionPractice;

public class ExceptionCases {

	public static void main(String[] args) {
		try {
		String str="Ankita";
		//char c[]=str.toCharArray();
		System.out.println(str.charAt(9));
	     int a[]=new int[5];
	    a[5]=30/0;
		}
		
        catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}
		
		 catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException exception");
			}
		
		 catch(StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException exception");
			}
		catch(Exception e) {
			System.out.println("generic");
		}
		
		finally {
			System.out.println("finally");
		}
		System.out.println("My name is ankita");
		

	}

}
