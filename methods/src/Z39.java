class Z39
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=1;
		test (i++ +i);  //i=i+1   +i
		System.out.println("Main end: " + i);
	}
	public static void test(int i)
	{
		System.out.println("From test: " +i);
		i=30;
	}
}