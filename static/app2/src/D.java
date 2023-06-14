class D 
{
	static int i=10;
	static int j=20;

	static 
	{
		//some code
		System.out.println("SIB"); //static initializing block
	}
	static 
	{
		//some code
		System.out.println("SIB"); //static initializing block
	}
	public static void main(String[] args) 
	{
		System.out.println(i + ", " +  j );
	}
	static 
	{
		//some code
		System.out.println("SIB"); //static initializing block
	}
	static 
	{
		//some code
		System.out.println("SIB"); //static initializing block
	}
}
