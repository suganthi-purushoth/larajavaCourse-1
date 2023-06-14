class M 
{
	int i; //non-static
	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println(m1.i); //initial value.
		m1.i =10; //we re-initialize any no.of times.
		System.out.println(m1.i);//re-initialize value.
	}
}
