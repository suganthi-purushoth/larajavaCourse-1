class K 
{
	static
	{
		System.out.println(i=10);
	}
	static void test()
	{
		System.out.println(i);
	}
	static
	{
		test();
	}
	static int i;
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
