class Z11
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int b1 =test();
		System.out.println("Main end: "+ b1);
	}
	public static int test()
	{
		System.out.println("From test");
		return 100 +300;
	}
}
