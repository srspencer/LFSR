package org.ludd.LFSR;
//Utility class to turn 4 boolean bits into a hex string
//no program logic except that needed for conversion

public class HexNybble {
	Nybble n;
	public HexNybble() {
		n=new Nybble();
	}
	
	public HexNybble(Nybble x){
		n=x;
	}
	
	public String toString(){
		int t = 0;
		if(n.getBit(0)){
			t=t+1;
		}
		if(n.getBit(1)){
			t=t+2;
		}
		if(n.getBit(2)){
			t=t+4;
		}
		if(n.getBit(3)){
			t=t+8;
		}
		return Integer.toHexString(t);
	}

	public static void main(String[] args) {
		//boolean f = false;
		//boolean t = true;
		Nybble n = new Nybble();
		n.shift(true);
		n.shift(n.getBit(0));n.shift(n.getBit(0));
		
		System.out.println((new HexNybble(n).toString()));
		

	}

}
