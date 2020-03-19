
public class MyIndexOutOfBoundException extends IndexOutOfBoundsException {
	
	private int lowerBound;
	private int upperBound;
	private int index;
	
	MyIndexOutOfBoundException(){
		super();
	}
	
	MyIndexOutOfBoundException(int lowerBound, int upperBound, int index){
		this.lowerBound=lowerBound;
		this.upperBound=upperBound;
		this.index=index;
	
	}
	
	
	public String toString() {		
		
		String exception= "Error Message: Index: " + index + " ,but Lower Bound: " + lowerBound + " ,Upper Bound: " + upperBound;
		
		return exception;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw new MyIndexOutOfBoundException(5,10,20);

	}

}
