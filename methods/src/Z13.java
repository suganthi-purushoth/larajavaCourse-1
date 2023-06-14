class Z13
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		String  b1 =test();
		System.out.println("Main end: "+ b1);
	}
	public static String test()
	{
		System.out.println("From test");
		String str = "Hello to all";
		return str;
	}
}