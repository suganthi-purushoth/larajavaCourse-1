class Z6 
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		boolean b1 =test();
		System.out.println("Main end: "+ b1);
	}
	public static boolean test()
	{
		System.out.println("From test");
		return true;
	}
}
