package AdvancedJavaConcepts;

public class SingletonClass {
	
	private SingletonClass() {
		
	}
	
	private static SingletonClass instance;
	
	
	public static SingletonClass getInstance() {
		System.out.println("test");
		if (instance == null) {
            instance = new SingletonClass();
        }

		return instance;
		
	}
	
	
	

	public static void main(String[] args) {
	
		SingletonClass ts=SingletonClass.getInstance();

		SingletonClass ts1=SingletonClass.getInstance();

		System.out.println(ts.getInstance());
		System.out.println(ts1.getInstance());
		System.out.println(ts==ts1);
	}

}
