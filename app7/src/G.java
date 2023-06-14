class G
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("pls supply two numbers" );
			return;

		}
		if(args.length == 1)
		{
			System.out.println("pls supply one more number" );
			return;
		}
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		System.out.println(i+j);
	}
}
