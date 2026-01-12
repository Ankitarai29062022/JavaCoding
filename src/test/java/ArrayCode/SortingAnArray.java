package ArrayCode;

import java.util.Arrays;
import java.util.Collections;

public class SortingAnArray {

	public static void main(String[] args) {
		Integer arr[]= {8,4,8,9,4,2,0,6};
		Arrays.sort(arr,Collections.reverseOrder());
System.out.println(Arrays.toString(arr));

	}

}
