class L 
{
	static int i = test();
	static int j = 10;
	static int test()
	{
		return j;
	}
	public static void main(String[] args) 
	{
		System.out.println(i +"," +j);
	}
}
