package CodePractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="LISTEN";
		String s2="SILENT";
		char[] s3=s1.toCharArray();
		char[] s4=s2.toCharArray();
		if(s1.length()==s2.length()) {
		
			Arrays.sort(s3);	
			Arrays.sort(s4);
			if(Arrays.equals(s3, s4)) {
				System.out.println("Ana");
			}
		}
		
		

	}

}
