package CollectionCode;

public class NoOfOccuranceswithoutMap {

	public static void main(String[] args) {
		String str="My name is Annkita";
		int len=str.length();
		int a=str.replace("n", "").length();
		int diff=len-a;
		System.out.println(diff);

	}

}
