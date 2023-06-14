class Z33
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int x;
		test (x=10);
		System.out.println("Main end");
	}
	public static void test(int i)
	{
		System.out.println("From test: " +i);
	}
}