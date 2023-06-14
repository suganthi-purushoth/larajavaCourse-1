class A88 
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
				System.out.print((i=='F' || k=='A' || k==i)?(k+" "): ((i=='E'&& k=='B') ?"2 ":((i=='E'&&k=='C') || (i=='D'&& k=='B') ? "1 ":"0 ")));
			}
			System.out.println();
		}
	}
}
