class Z4 
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		byte b1 =test();
		System.out.println("Main end: "+ b1);
	}
	public static byte test()
	{
		System.out.println("from test");
		return 100;
	}
}
