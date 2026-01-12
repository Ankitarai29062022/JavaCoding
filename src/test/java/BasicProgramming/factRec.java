package BasicProgramming;

public class factRec {
	

	public static void main(String[] args) {
		String str="Ankita";
		String rev="";
		
	//char c[]=str.toCharArray();
	for(int i=str.length()-1;i>=0;i--) {
		
		rev=rev+str.charAt(i);
		
	}
		System.out.println(rev);
		
	}
	
}
