package CodePractice;

public class MethodOverloading {
//public void abc(int a,String b) {
//		System.out.println("ab");
//	}
//public void abc(int f,String g) {  //not possible
//	System.out.println("ab");
//}
//	
public void abc(String a,int b) {
	System.out.println("Stringab");
	
	
}

public void abc(int a,String b) {
	System.out.println("intab");

	
}

public void add(int a,int b) {
	System.out.println("intab");
}

public void add(byte a,byte b) {
	System.out.println("byteab");
	
}


	public static void main(String[] args) {
		MethodOverloading ab=new MethodOverloading();
		
		ab.abc(6, "9");
		ab.abc("9", 6);
		
	

	}

}
