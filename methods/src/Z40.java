class Z40
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=1;
		test (i++ + i++ + i + i++);  //last i=4 
		System.out.println("Main end: " + i);
	}
	public static void test(int i)
	{
		System.out.println("From test: " +i); //1+2+3+3  //3 become 4
		i=30;
	}
}