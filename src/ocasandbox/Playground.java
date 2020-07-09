package ocasandbox;

public class Playground {
	
	private static int statInt = 1;
	
	public void setStatInt(int newVal) {
		
		statInt = newVal;
	}
	
	public int getStatInt() {
		return statInt;
	}
	
	public void printStatInt() {
		System.out.println(statInt);
	}
	
	public static void main(String[] args) {
		Playground pg = new Playground();
		pg.printStatInt();
		pg.setStatInt(5);
		pg.printStatInt();
	}

}
