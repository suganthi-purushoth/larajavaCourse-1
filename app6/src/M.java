class M 
{
	public static void main(String[] args) 
	{
		int i = 64;
		String s1 = Integer.toBinaryString(i);
		System.out.println(s1);
	}
}


/*

			64 / 2 = 32  ---- r0

			32 / 2 = 16  ---- r0

			16 / 2 = 8   ---- r0

			8  / 2 = 4   ---- r0

			4  / 2 = 2   ---- r0

			2  / 2 = 1   ---- r0

			1  / 2 = 0   ---- r1
			---------------------
								1000000

*/