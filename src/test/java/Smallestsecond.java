
public class Smallestsecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,9,300,800,6,700};
		int largest=0;
		int secndlargest=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>largest) {
				
				secndlargest=largest;
				largest=a[i];
			}
		
				else if(a[i] > secndlargest) {
					secndlargest=a[i];
				
			}
			
			
		}
		System.out.println(largest);
		System.out.println(secndlargest);
//		for(int i=1;i<=a.length-1;i++) {
//			if(a[i]>largest) {
//				largest=a[i];
//			}

	}

}
