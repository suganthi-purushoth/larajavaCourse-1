class K 
{
	public static void main(String[] args) 
	{
		if(args.length < 3)
		{
			System.out.println("Supply 3 command line argumants");
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);
		// i = 10, j = 20, k = 30.
		int min = i < j ? (i < k ? i: k) : (j < k ? j : k);
		System.out.println("min b/w " + i + " , " + j + " and " + k +" is " + min);
	}
}
