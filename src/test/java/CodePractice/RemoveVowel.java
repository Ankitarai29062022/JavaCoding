package CodePractice;

import java.util.Scanner;

public class RemoveVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="";
		System.out.println("Enter the name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char c[]=name.toCharArray();
	
	for(char m:c) {
		if(!(m=='a'||m=='e'||m=='i'||m=='o'||m=='u'||m=='A'||m=='E'||m=='I'||m=='O'||m=='U')) {
			n=n+m;
	}
		

	}
	System.out.println(n);}

}
