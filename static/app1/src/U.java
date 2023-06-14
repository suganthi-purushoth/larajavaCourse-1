class U
{
	static int i;
	public static void main(String[] args) 
	{
		
		i=5;
		System.out.println("main: " +U.i);
		System.out.println("main: " +i);
		test();
		test();
	}
	public static void test() 
	{
		System.out.println("test: " +i);
	}
}
