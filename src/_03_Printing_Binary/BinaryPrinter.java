package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	public static void main(String[] args) {
		BinaryPrinter bp = new BinaryPrinter();
		
		Byte b = 13;
		bp.printByteBinary(b);
		System.out.println();
		Short s = Short.MAX_VALUE;
		bp.printShortBinary(s);
		int i = 1567;
		System.out.println();
		bp.printIntBinary(i);
		System.out.println();
		long l = 1231234567;
		bp.printLongBinary(l);
	}
	
	public void printByteBinary(byte b) {
		System.out.print((b & 0b10000000) >> 7);
		System.out.print((b & 0b01000000) >> 6);
		System.out.print((b & 0b00100000) >> 5);
		System.out.print((b & 0b00010000) >> 4);
		System.out.print((b & 0b00001000) >> 3);
		System.out.print((b & 0b00000100) >> 2);
		System.out.print((b & 0b00000010) >> 1);
		System.out.print((b & 0b00000001) >> 0);
	}
	
	public void printShortBinary(short s) {
		printByteBinary((byte)((s & 0xFF00) >> 8));
		printByteBinary((byte)((s & 0x00FF) >> 0));
	}
	
	public void printIntBinary(int i) {
		printShortBinary((short)((i & 0xFFFF0000)>>8));
		printShortBinary((short)((i & 0x0000FFFF)>>8));
	}
	
	public void printLongBinary(long l) {
		printIntBinary((int)(l>>32));
		printIntBinary((int)((l & 0x00000000FFFFFFFF) >> 0));	}
}
