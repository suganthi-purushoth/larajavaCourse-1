class Y 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(99));
		System.out.println(99 >> 1);	// right shift by 1
		System.out.println(99 >> 2);	// right shift by 2
		System.out.println(99 << 1);	// left shift by 1
		System.out.println(99 << 2);	// left shift by 2
	}
}


/*


binary string format of 99:   1100011

left shift 1 times		  :  11000110  ==> (128+64+0+0+0+4+2+0)198

left shift 2 times		  : 110001100  ==> (256+128+0+0+0+8+4+0+0) 396

binary string format of 99:  1100011

right shift 1 times		  :  0110001   ==> (0+32+16+0+0+0+1) 49

right shift 2 times		  :  0011000   ==> (0+0+16+8+0+0+0)  24

*/