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
		
		int x = 5;
		int y = 6; 
		int z = x | y;
		
		int a = -4;
		int b = -8;
		int c = a ^ b;
				
		
		System.out.println(c);
		int mask = 1;
		int m = ~6;
		
		System.out.println(m);
		
		
	}

}
