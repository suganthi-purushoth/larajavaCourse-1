class Z34
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i;
		test (i=10);
		System.out.println("Main end: " + i);
	}
	public static void test(int i)
	{
		System.out.println("From test: " +i);
		i=30;
	}
}