class J 
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("Supply 2 command line argumants");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int min = i < j ? i : j;
		System.out.println("min b/w " + i + " and " + j + " is " + min);
	}
}
