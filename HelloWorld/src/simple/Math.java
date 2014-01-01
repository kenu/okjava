package simple;

public class Math {

	public static int lastSum;

	public static void main(String[] args) {
		// 2, 3 ¥ı«œ±‚
		System.out.println(lastSum);
		System.out.println(add(2, 3));
		
		// 3 + 5
		System.out.println(lastSum);
		System.out.println(add(3, 5));

	}

	public static int add(int a, int b) {
		lastSum = a + b;
		return lastSum;
	}

}
