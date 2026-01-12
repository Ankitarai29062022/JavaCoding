package OOPsConcept;

public class Interface2 implements Interface1 {

	@Override
	public void test() {
		
		System.out.println("test");
	}
	
	public void test1() {
		
		System.out.println("test1");
	}
public static void main(String args[]) {
	Interface2 in=new Interface2();
	in.test();
	in.test1(); //error
	Integer i=new Integer(10);
	int m=i.intValue();
	
}
}
