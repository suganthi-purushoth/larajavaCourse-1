class A138 
{
	public static void main(String[] args) 
	{
		int m=14;
		char k='a';
		for (int i=1; i<=7;i++ )
		{
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=m-i ;j++ )
			{
				System.out.print((j==1 || j==m-i)?(k +" "):("  "));
			}
			m--;
			k++;
			System.out.println();
		}
	}
}
