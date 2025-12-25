package ExceptionPractice;

public class CannotJoin extends Exception {

	public CannotJoin(String message) {
		super(message);
	}

	
	public static void NoticePeriodLeft(int days) {
		try {
			if (days > 60) {
				throw new CannotJoin("Cannot join");
			}
		} catch (CannotJoin e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		NoticePeriodLeft(30);
		
		
	}

}
