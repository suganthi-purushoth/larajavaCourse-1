class Y2
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(457));
		System.out.println(457 >> 1);	// right shift by 1
		System.out.println(457 >> 2);	// right shift by 2
		System.out.println(457 << 1);	// left shift by 1
		System.out.println(457 << 2);	// left shift by 2
	}
}

/*


binary string format of 457: 256+128+64+8+1  : 111001001

left shift 1 times							 : 1110010010 (512+256+128+0+0+16+0+0+2+0) 914

left shift 2 times							 : 11100100100 (1024+512+256+0+0+32+0+0+4+0+0) 1828

binary string format of 457:  256+128+64+8+1 : 111001001

right shift 1 times						     : 011100100 (128+64+32+0+0+4+0+0)  228

right shift 2 times						     : 001110010 (0+0+64+32+16+0+0+2+0)  114

*/