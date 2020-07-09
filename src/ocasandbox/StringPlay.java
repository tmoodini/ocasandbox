package ocasandbox;

public class StringPlay {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb + " " + sb.hashCode());
		sb = sb.reverse();
		System.out.println(sb + " " + sb.hashCode());
		
	}

}
