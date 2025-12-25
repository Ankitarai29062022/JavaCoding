package CodePractice;

public class PolimorphismCon2 {
	
public PolimorphismCon2 abc() {
	System.out.println("parent");
	return new PolimorphismCon2();
		
	}

public void def() {
	System.out.println("def child");
}

public void defgh() {
	System.out.println("defgh child");
}

}
