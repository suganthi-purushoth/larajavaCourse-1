class C2 
{
	public static void main(String[] args) 
	{
		System.out.println("Total arguments: " +args.length);
		for (String elements : args )
		{
			System.out.println(elements);
		}

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		System.out.println(i);
		System.out.println(j);
	}
}