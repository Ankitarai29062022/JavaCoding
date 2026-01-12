package ArrayCode;

public class arrayRev {

	public static void main(String[] args) {
String arr[]= {"one","two","three","four","five"};
//output "one","owt","three","rouf","five"

for(int i=0;i<arr.length;i++) {
	if(i%2!=0) {
		char m[]=arr[i].toCharArray();
		String rev="";
		for(int j=m.length-1;j>=0;j--) {
			rev=rev+m[j];
		}
		arr[i]=rev;	
	}
	
	
}
for(String u:arr) {
	System.out.println(u);
}
	}

}
