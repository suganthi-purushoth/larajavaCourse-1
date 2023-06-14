class O 
{
	public static void main(String[] args) 
	{
		int i = 450;
		System.out.println(Integer.toBinaryString(i));
	}
}


/*

		450 / 2 = 225  ----r0
		225 / 2 = 112  ----r1
		112 / 2 = 56   ----r1
		56  / 2 = 28   ----r0




		111000010

		0+2+0+0+0+64+128+256 = 450

