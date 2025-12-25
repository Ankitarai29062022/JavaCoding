package CodePractice;

public class stringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Comparison - Performance
		long start = System.currentTimeMillis();
		String s = "";
		for (int i = 0; i < 10000; i++) {
		 s += i; // Creates new String each iteration
		}
		System.out.println("String: " + (System.currentTimeMillis() - start)); //
		//Slower
		start = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
		 sb2.append(i); // Appends to same object
		}
		System.out.println("StringBuilder: " + (System.currentTimeMillis() - start));
		// Faster

	}

}
