package CodePractice;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is demo";
		System.out.println(str.replace("is", "was"));
		System.out.println(str.replaceFirst("is", "was"));
		System.out.println(str.replaceAll("is(.)", "was"));

	}

}
