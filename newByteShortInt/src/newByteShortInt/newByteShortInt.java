package newByteShortInt;

public class newByteShortInt {

	public static void main(String[] args) {
		// int has a width of 32

		int myMinValue = -2_147_483_648;
		int myMaxValue = 2_147_483_647;
		int myTotal = (myMinValue/2);
		System.out.println("myTotal = " +myTotal);
		
		// byte has a width of 8
		byte myByteValue = 127;
		byte myNewByteValue = (byte) (myByteValue/2);
		System.out.println("myNewByteValue = " +myNewByteValue);
		
		// short has a width of 16
		short myShortValue = 32767;
		short myNewShortValue = (short)(myShortValue/2);
		
		// long has a width of 64
		long myLongValue = 100L;
		
		byte a = 10;
		short b = 20;
		int c = 50;
		long d = 50000 + 10 * (a + b + c);
		System.out.println("Answer: " +d);
		short shortTotal = (short)(1000 + 10 * (a + b + c));
		System.out.println("shortTotal = " +shortTotal);
		
		
	}

}
