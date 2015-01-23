package enumexample;

public enum CoffeeType {
	
	SMALL(1), MEDIUM(2), LARGE(3);
	
	int value;
	CoffeeType(int value) {
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
}