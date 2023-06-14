class A106 
{
	public static void main(String[] args) 
	{
		int m=0;
		for (char i='a';i<='f' ;i++ )
		{
			for (char j='f';j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (char j='a';j<=i+m ;j++ )
			{
				System.out.print(j + " ");
			}
			m++;
			System.out.println();
		}
	}
}
