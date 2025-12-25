
public class raiankita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ankita Rai";
		String rev="";
		
		String[] s=str.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			rev=rev+s[i]+" ";
			
			
			
		}
		System.out.println(rev);

	}

}
