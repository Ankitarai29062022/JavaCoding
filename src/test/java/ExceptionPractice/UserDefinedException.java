package ExceptionPractice;

public class UserDefinedException {

	public static void main(String[] args) {
		int age=16;
	try {
		if(age<18) {
			throw new UnderAge();
		}}
		catch(UnderAge e){
			e.printStackTrace();
			
		}
	

	}

}
