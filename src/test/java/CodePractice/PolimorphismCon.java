package CodePractice;

public class PolimorphismCon extends PolimorphismCon2 {

	public static void main(String[] args) {

		PolimorphismCon ab=new PolimorphismCon();
		ab.abc();
		ab.defgh();
		
		PolimorphismCon2 cd=new PolimorphismCon2();
		cd.abc();
		
		
		PolimorphismCon2 ef=new PolimorphismCon();
		ef.abc();
	

	}
	
	public PolimorphismCon abc() {
		PolimorphismCon obj=new PolimorphismCon();
		System.out.println("child");
		return obj;
	}
	
	public void def() {
		System.out.println("def child");
	}
	
	public void defg() {
		System.out.println("defg child");
	}

}
