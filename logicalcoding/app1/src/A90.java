class A90 
{
	public static void main(String[] args) 
	{
		for (char i='P';i<='U' ;i++ )
		{
			for (char j='U';j>i ; j--)
			{
				System.out.print("  ");
			}
			int n=0;
			for (char k='P';k<=i ;k++ )
			{
				System.out.print((k=='P' || k==i || i=='U')?(k +" "):(n++ +" "));
			}
			System.out.println();
		}
	}
}
