class H 
{
	void test()
	{
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		h1.test();
		System.out.println("done");
	}
}
/*
1.non-static method test is loading to the memory whenever we creating an object to the H class.
2.by using H class reference h1 we can access test method which is non-static
*/