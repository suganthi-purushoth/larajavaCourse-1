class D 
{
	static int i;
	static int j = D.i;
	public static void main(String[] args) 
	{
		System.out.println("done");
		System.out.println(i);
		System.out.println(j);
	}
}
