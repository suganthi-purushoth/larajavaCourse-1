class Z7 
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		char b1 =test();
		System.out.println("Main end: "+ b1);
	}
	public static char test()
	{
		System.out.println("From test");
		return '$';
	}
}
