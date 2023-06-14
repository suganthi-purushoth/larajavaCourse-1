class E 
{
	static int i=test1(); //variable
	static int j=test2(); //variable

	static  //sib
	{
		System.out.println("from SIB");
	}
	static int test1() //s method
	{
		System.out.println("from test1");
		return 10;
	}
	static int test2() //s method
	{
		System.out.println("from test2");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main: " + i +", " + j);
	}
}
