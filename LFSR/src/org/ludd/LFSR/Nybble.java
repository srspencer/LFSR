package org.ludd.LFSR;
public class Nybble{
	boolean[] bits;

	public Nybble(){
		bits = new boolean[4];
		for(int i=0;i<4;i++){
			bits[i] = false;
		}
	}

	public Nybble(boolean a, boolean b, boolean c, boolean d){
		bits[0]=a;
		bits[1]=b;
		bits[2]=c;
		bits[3]=d;
	}

	public boolean getBit(int i){
		return bits[i];
	}

	public static boolean And(boolean a, boolean b){
		if (a){
			if(b){
				return(true);
			}
		}	
		return(false);
	}

	public static boolean Or(boolean a, boolean b){
		if(a)
			return(true);
		if(b)
			return(true);
		return(false);
	}

	public static boolean Xor(boolean a, boolean b){
		if(!a){
			if(b){
				return(true);
			}
		}
		if(!b){
			if(a){
				return(true);
			}
		}
		return(false);
	}
	
	public boolean shift(){
		boolean rc = this.bits[0];
		for (int i=0;i<bits.length;i++){
			bits[i]=bits[i+1];
		}
		bits[bits.length-1]=false;
		return(rc);
	}	
	
	public boolean shift(boolean a){
		boolean rc = this.bits[0];
                for (int i=0;i<bits.length-1;i++){
                        bits[i]=bits[i+1];
                }
                bits[bits.length-1]=a;
                return(rc);
        }

}
