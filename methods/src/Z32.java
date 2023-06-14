class Z32
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int x=30;
		test (x);
		System.out.println("Main end");
	}
	public static void test(int i)
	{
		System.out.println("From test: " +i);
	}
}