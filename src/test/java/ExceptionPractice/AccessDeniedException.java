package ExceptionPractice;

public class AccessDeniedException extends Exception {
	
	public AccessDeniedException(String message) {
		super(message);
		
	}
	
	public static void openSettings(String role) throws AccessDeniedException {
		if(!role.equals("PRIVILEDGED")) {
			
			throw new AccessDeniedException("General user cannot access settings page");
		}
		
		System.out.println("SUCCESS");
		
	}
	public static void main(String[] args) {
		
		try {
			openSettings("GENERAL");
		} catch (AccessDeniedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
