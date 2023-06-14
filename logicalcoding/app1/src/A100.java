class A100 
{
	public static void main(String[] args) 
	{
		for (char i='p';i<='u' ;i++ )
		{
			for (char j='p';j<=i ;j++ )
			{
				System.out.print((j=='p'||j==i)?(j +" "):("0 "));
			}
			System.out.println();
		}
		char n='v';
		for (char i='t';i>='p' ;i-- )
		{
			for (char j='p';j<=i ;j++ )
			{
				System.out.print((j=='p')?(j +" "):((j==i)?(n++ +" "):("0 ")));
			}
			System.out.println();
		}
	}
}
