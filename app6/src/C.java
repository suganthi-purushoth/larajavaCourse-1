class C 
{
	public static void main(String[] args) 
	{
		int i =0;
		int j =0;
		System.out.println(i++ + i);		// post
		System.out.println(i);
		System.out.println(i);
		System.out.println("---------------");
		System.out.println(++j + j);		// pre
		System.out.println(j);
		System.out.println(j);

	}
}
