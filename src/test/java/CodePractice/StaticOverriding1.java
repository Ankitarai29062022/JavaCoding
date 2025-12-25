package CodePractice;

public class StaticOverriding1 extends StaticOverriding2 {
	
	public static void main(String args[]) {
//	
	StaticOverriding1 sb=new StaticOverriding1();
	sb.add();
//	sb.ind();
	//sb.sub();
//	
	StaticOverriding2 sb1=new StaticOverriding2();
	sb1.add();
	
	StaticOverriding2 sb3=new StaticOverriding1();
	sb3.add();
	

}
public static void add() {
	System.out.println("Child overriding");
}
public  void sub() {
	System.out.println("Child sb suboverriding");
}

public void ind() {
	System.out.println("Child ind overriding");
}}
