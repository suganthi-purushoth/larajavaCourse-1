class Z36
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int x=1;
		test (x+20);
		System.out.println("Main end: " + x);
	}
	public static void test(int i)
	{
		System.out.println("From test: " +i);
		i=30;
	}
}