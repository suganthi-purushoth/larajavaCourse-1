class Z20
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		test(200);
		System.out.println("Main end");
	}
	public static void test(int i)
	{
		System.out.println("From test: " + i);
		i=30;
		System.out.println("From test: " + i);
	}
}