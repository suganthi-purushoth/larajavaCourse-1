class A129 
{
	public static void main(String[] args) 
	{
		int m=1;
		for (char i='a';i<='e' ;i++ )
		{
			for (char j='e';j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (char j='a';j<=i ;j++ )
			{
				System.out.print((j=='a' || j==i)?(i +" "):(m++ +" "));
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
				System.out.print((j==i || j=='i')?(i +" "):(m++ +" "));
			}
			System.out.println();
		}
	}
}
