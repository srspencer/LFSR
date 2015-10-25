package org.ludd.LFSR;

//taps at bit 7, 6, 1 per article at
//https://en.wikipedia.org/wiki/Linear_feedback_shift_register

public class Main {
	static Byte b;
	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		b=new Byte();
		b.shift(true);
		
		for (int i=0;i<256;i++){
			boolean x = Nybble.Xor(b.getBit(7), b.getBit(6));
			boolean y = Nybble.Xor(x, b.getBit(0));
			System.out.println(b.shift(y));
		}

	}

}