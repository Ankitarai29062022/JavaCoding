
public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		int sum=0;
		
		while(a>0) {
		int c=a%10;
		sum=sum+c;
		a=a/10;
		}
		System.out.println(sum);
		
	}

}
