class M2 
{
	/* IIB(instance initialization block)
		this will be executed while objects are created before the execution of constructor.
	*/
	{ // non-static block
		System.out.println(i); 
	}
	int i;
	public static void main(String[] args) 
	{
		M2 m2 = new M2();
	}
}
/*
1.illegal forward reference applies to non-static variable also.
*/