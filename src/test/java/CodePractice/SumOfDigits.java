package CodePractice;

public class SumOfDigits {

	public static void main(String[] args) {
		int a=12345;
		int sum=0;
//		String m=String.valueOf(a);
//		char c[]=m.toCharArray();
//		for(char n:c) {
//			sum=sum+Integer.parseInt(m.valueOf(n));
//}
		while(a>0) {
			sum=sum+a%10;
			a=a/10;
		}
		System.out.println(sum);
		
		
		
System.out.println(sum);
	}

}
