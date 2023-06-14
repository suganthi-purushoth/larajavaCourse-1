class X2 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(523));
		System.out.println(Integer.toBinaryString(42));
		System.out.println(523 | 42);  //  bitwise or
		System.out.println(523 & 42);  //  bitwise and
		System.out.println(523 ^ 42);  //  bitwise xor
	}
}


/*

binary 523 = 512+8+2+1 = 1000001011

binary 42  = 32+8+2    = 101010

binary string format of 523:  1000001011
binary string format of  42:  0000101010
-----------------------------------------
bitwise | (or)             :  1000101011   (512+0+0+0+32+0+8+0+2+1) 556



binary string format of 523:  1000001011
binary string format of  42:  0000101010
-----------------------------------------
bitwise & (and)            :  0000001010   ( 8+0+2+0) 10



binary string format of 523:  1000001011
binary string format of  42:  0000101010
----------------------------------------
bitwise ^ (xor)            :  1000100001   (512+0+0+0+32+0+0+0+0+1) 545

*/