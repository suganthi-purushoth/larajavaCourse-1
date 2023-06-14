class A116 
{
	public static void main(String[] args) 
	{
		int m=10;
		for (int i=1; i<=5;i++ )
		{
			char n='a';
			for (int j=1;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=m-i ;j++ )
			{
				System.out.print((i==1 ||j==1 || j==m-i)?("1 "):(n++ +" "));
			}
			m--;
			System.out.println();
		}
	}
}
