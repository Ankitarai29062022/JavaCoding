package CodePractice;

public class OverridingChild extends OverridingParent {
	
	public OverridingChild ankita() {
		System.out.println("you r child");
		return new OverridingChild() ;
	}
	
	public static void main(String[] args) {
		
		OverridingChild  mp=new OverridingChild();
		mp.ankita();
		
	}


}
