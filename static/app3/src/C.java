class C 
{
	static int i;
	static int j = i;
	public static void main(String[] args) 
	{
		System.out.println("done");
		System.out.println(i);
		System.out.println(j);
	}
}