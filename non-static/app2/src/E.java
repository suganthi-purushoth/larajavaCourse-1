class E 
{
	int i;
	E(int k)
	{
		System.out.println("K(int)");
		i = 10;
	}
	public static void main(String[] args) 
	{
		E e1 = new E(9);
		System.out.println("--------");
		E e2 = new E(90);
		System.out.println("--------");
		E e3 = new E(910);
		System.out.println("--------");
		System.out.println(e1.i);
		System.out.println(e2.i);
		System.out.println(e3.i);
	}
}
/*
1.for one object creation that particular constructor executes only once (constructor chaining is different)
2.according to the constructor argument datatype, we must supply the value while calling that constructor.
*/