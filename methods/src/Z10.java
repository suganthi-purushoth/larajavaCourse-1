class Z10
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int b1 =test1();
		System.out.println("Main end: "+ b1);
	}
	public static int test1()
	{
		System.out.println("From test1");
		return test2();
	}
	public static int test2()
	{
		System.out.println("From test2");
		return 200;
	}
}
