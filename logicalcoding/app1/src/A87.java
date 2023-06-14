class A87 
{
	public static void main(String[] args) 
	{
		for (char i='A';i<='F' ;i++ )
		{
			for (char j='F';j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (char k=i;k>='A' ;k-- )
			{
				System.out.print((k=='A' || i=='F'|| k==i)?(k+" "):"0 ");
			}
			System.out.println();
		}
	}
}
