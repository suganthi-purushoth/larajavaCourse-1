class A109 
{
	public static void main(String[] args) 
	{
		int m=0;
		char n='a';
		for (char i='a';i<='f' ;i++ )
		{
			int o=1;
			for (char j='f';j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (char j='a';j<=i+m ;j++ )
			{
				System.out.print((j=='a')?(j +" "):((j==i+m)?(++n +" "):(o++ +" ")));
			}
			m++;
			System.out.println();
		}
	}
}
