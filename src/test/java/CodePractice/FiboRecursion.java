package CodePractice;

public class FiboRecursion {
	static int c;
	int a=0;
	int b=1;
	

	public static void main(String[] args) {
		FiboRecursion fb=new FiboRecursion();
		fb.rec(8);

	}
public void rec(int no) {
	if(no>1) {
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
	rec(no-1);
			
}}
}
