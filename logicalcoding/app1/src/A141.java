class A141 
{
	public static void main(String[] args) 
	{
		for (char i='a';i<='e' ;i++ )
		{
			char n='p';
			for (int j='e';j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (int j='a';j<=i ;j++ )
			{
				System.out.print((j=='a'||j==i)?(i + " "):(n++ + " "));
			}
			System.out.println();
		}
		for (char i='f';i<='i' ;i++ )
		{
			char n='p';
			for (char j='e';j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (char j=i;j<='i' ;j++ )
			{
				System.out.print((j==i || j=='i')?(i +" "):(n++ +" "));
			}
			System.out.println();
		}
	}
}
