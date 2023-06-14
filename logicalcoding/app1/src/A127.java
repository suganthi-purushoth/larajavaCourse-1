class A127 
{
	public static void main(String[] args) 
	{
		for (char i='a';i<='e' ;i++ )
		{
			for (char j='e';j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (char j='a';j<=i ;j++ )
			{
				System.out.print((j=='a' || j==i)?(i +" "):("0 "));
			}
			System.out.println();
		}
		for (char i='f';i<='i' ;i++ )
		{
			for (char j='f';j<=i ;j++ )
			{
				System.out.print("  ");
			}
			for (char j=i;j<='i' ; j++)
			{
				System.out.print((j==i || j=='i')?(i +" "):("0 "));
			}
			System.out.println();
		}
	}
}
