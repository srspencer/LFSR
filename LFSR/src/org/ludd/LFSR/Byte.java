package org.ludd.LFSR;

public class Byte {
	Nybble hi, lo;
	public Byte() {
		hi=new Nybble();
		lo=new Nybble();
	}
	
	public boolean getBit(int i){
		if(i<4){
			return lo.getBit(i);
		}else{
			return hi.getBit(-4);
		}
	}

	public boolean shift(){
		return(lo.shift(hi.shift()));
	}
	
	public boolean shift(boolean a){
		return(lo.shift(hi.shift(a)));
	}
}
