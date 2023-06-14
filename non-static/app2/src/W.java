class W 
{
	static
	{
		System.out.println("SIB");
	}
	W()
	{
		System.out.println("W()");
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("------");
		W w2 = new W();
		System.out.println("------");
	}
}
/*
1.static block executes only once while loading the class.
2.constructor executes each and every time while creating the object.
*/