class Y1 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(46));
		System.out.println(46 >> 1);	// right shift by 1
		System.out.println(46 >> 2);	// right shift by 2
		System.out.println(46 << 1);	// left shift by 1
		System.out.println(46 << 2);	// left shift by 2
	}
}

/*


binary string format of 46:  32+8+4+2 : 101110

left shift 1 times					  : 1011100 (64+0+16+8+4+0+0) 92

left shift 2 times					  : 10111000 (128+0+32+16+8+0+0+0) 184

binary string format of 46:  32+8+4+2 : 101110

right shift 1 times					  : 010111 (0+16+0+4+2+1) 23

right shift 2 times					  : 001011 (0+0+8+0+2+1) 11
*/