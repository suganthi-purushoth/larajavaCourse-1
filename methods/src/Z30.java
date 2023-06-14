class Z30
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		test(10,true,30);
		System.out.println("Main end");
	}
	public static void test(int i,boolean j,int k)
	{
		System.out.println("From test: " + i);
		System.out.println("From test: " + j);
		System.out.println("From test: " + k);
	}
}