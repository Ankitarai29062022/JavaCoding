package CodePractice;

public class upperToLower {

	public static void main(String[] args) {
	
			String str="AnKIta";
			//output aNkiTA
		
			StringBuilder sb=new StringBuilder();
			char[] c=str.toCharArray();
			for(int i=0;i<=c.length-1;i++) {
			if(c[i]>='A' && c[i]<='Z') {
            c[i]=Character.toLowerCase(c[i])	;
            }
			
			else if(c[i]>='a' && c[i]<='z') {
	           c[i]= Character.toUpperCase(c[i]);	
	            }
			sb.append(c[i]);
			
	
			}
			System.out.println(sb.toString());
			
	
	}

}
