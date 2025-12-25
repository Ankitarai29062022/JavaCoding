package CodePractice;

import org.testng.annotations.Test;

public class SwitchPractice {
	
	@Test
	public void sizechk() {
		int no =44;
		String size = "";
		switch(no) {
		case 33:
			size="Small";
			break;
			
		case 83:
			size="Medium";
			break;
			
		case 44:
			size="Large";
			break;
	}
System.out.println(size);
}
}