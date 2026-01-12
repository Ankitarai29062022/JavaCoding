package BasicProgramming;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8
		int a=0,b=1;
		int c = 0 ;
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=0;i<=no;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			
		}
		
		

	}

}
