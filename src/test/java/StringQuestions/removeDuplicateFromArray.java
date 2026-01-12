package StringQuestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateFromArray {

	public static void main(String[] args) {
int arr[]= {4,2,7,5,3,5};
Set<Integer> st=new LinkedHashSet<Integer>();

for(int m:arr) {
	st.add(m);
}


System.out.println(st);


	}

}
