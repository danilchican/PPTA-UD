package package_name;

public class ClassName {

	public int first = 10;
	private int second = 1;
	
	protected int nonInitVar;
	int secondNonInitVar;

	int third = 8;

	private void firstFunc() {	
		int a = 2;
		a = 1 + a;
	}

	public static void main() {
		int b = 3;
		int c = 1;
		c = b;
		System.out.println(c);
	}
}