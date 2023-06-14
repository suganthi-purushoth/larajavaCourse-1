class N 
{
	public static void main(String[] args) 
	{

		System.out.println(Integer.toBinaryString(77));
	}
}


/*
	77 / 2 = 38 ---- r1

	38 / 2 = 19 ---- r0

	19 / 2 = 9  ---- r1

	9  / 2 = 4  ---- r1

	4  / 2 = 2  ---- r0

	2  / 2 = 1  ---- r0

	1  / 2 = 0  ---- r1

	---------------------
					1001101

*/