package Java8;


	public abstract class ComparableMethod implements Comparable<ComparableMethod> {
	    int rollNo;
	    String name;

	    ComparableMethod(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	    }

	    @Override
	    public int compareTo(ComparableMethod s) {
	        return this.rollNo - s.rollNo;
	    }
	

}
