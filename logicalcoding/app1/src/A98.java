class A98 
{
	public static void main(String[] args) 
	{
		for (char i='p';i<='u' ;i++ )
		{
			for (char j='p';j<=i ; j++)
			{
				System.out.print((j=='p'||j==i)?("0 "):(j + " "));
			}
			System.out.println();
		}
		for (char i='t';i>='p' ;i-- )
		{
			for (char j='p';j<=i ;j++ )
			{
				System.out.print((j=='p'||j==i)?("0 "):(j + " "));
			}
			System.out.println();
		}
	}
}
