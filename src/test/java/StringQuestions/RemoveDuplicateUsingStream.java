package StringQuestions;

import java.util.Arrays;

public class RemoveDuplicateUsingStream {

	public static void main(String[] args) {
		int arr[]= {6,7,8,5,6};
		int arr1[]=Arrays.stream(arr).distinct().toArray();
for(int m:arr1) {
	System.out.print(m);
}

	}

}
