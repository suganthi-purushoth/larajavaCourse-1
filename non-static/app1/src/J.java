class J 
{
	void test1() //non-static
	{
		System.out.println("from test1");
	}
	static void test2() //static
	{
		J obj = new J();
		obj.test1(); // by using obj reference we accessing non-static test1()
		System.out.println("from test2");
	}
}
/*
1.non-static test1 method is loading while creating object to J class in the test2 static method.
*/