
public class child1 extends Parent {
	
//	public void show() {
//		System.out.println("static Child show");
//		
//	}
	
	public void notshow() {
		System.out.println("Child notshow");
		
	}
	
	

	public static void main(String[] args) {
		Parent p=new Parent();
		p.parentnotshow();
		p.show();
		//p.notshow();
		
		child1 c=new child1();
		c.show();
		c.notshow();
		c.parentnotshow();
		
		Parent p1=new child1();
		p1.show();
		//p1.notshow();
		p1.parentnotshow();
		
	}

}
