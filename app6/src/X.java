class X 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(25));
		System.out.println(Integer.toBinaryString(48));
		System.out.println(25 | 48);  //  bitwise or
		System.out.println(25 & 48);  //  bitwise and
		System.out.println(25 ^ 48);  //  bitwise xor
	}
}


/*

binary string format of 25:  011001
binary string format of 48:  110000
-------------------------------------
bitwise | (or)					:  111001   ==>57



binary string format of 25:  011001
binary string format of 48:  110000
-------------------------------------
bitwise & (and)				:  010000   ==>16



binary string format of 25:  011001
binary string format of 48:  110000
-------------------------------------
bitwise ^ (xor)				:  101001   ==>41

*/