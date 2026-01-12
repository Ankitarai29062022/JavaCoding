package OOPsConcept;

public class Abstract2 extends Abstract1 {

	@Override
	public void name() {
		
		System.out.println("name");
		
	}
	
public void father() {
		
		System.out.println("father");
		
	}
	
	public static void main(String args[]) {
		
		Abstract1 ab=new Abstract2();
		ab.rollno();
		ab.name();
		Abstract2 ab1=new Abstract2();
		ab1.rollno();
		ab1.father();
		ab1.name();
		
	}
	
	

}
