package CodePractice;

public class TC01_StaticPractice {

	static int num=10;
	int ori=20;
	public static void staticmethtest() {
		System.out.println("Static Method");
		System.out.println(num);
		//System.out.println(ori);
		
		
		
	}
	
	public  void nonstaticmethtest() {
		System.out.println("Non Static Method");
		System.out.println(num);
		System.out.println(ori);
		staticmethtest();
		
	}
	
	public static void main(String[] args) {
		staticmethtest();
		TC01_StaticPractice tc01_StaticPractice = new TC01_StaticPractice();
		tc01_StaticPractice.nonstaticmethtest();

	}

}
