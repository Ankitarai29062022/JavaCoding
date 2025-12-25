package CodePractice;

public class StringPallindrome {

	public static void main(String[] args) {
		String str="abbai";
	String temp="";
		
		char c[]=str.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			temp=temp+str.charAt(i);
			
		}
		if(temp.equals(str)) {
			System.out.println("Palli");
		}

	}

}
