class A79 
{
	public static void main(String[] args) 
	{
		for (char i='a';i<='h' ;i++ )
		{
			for (char j='a';j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (char k='h';k>=i ;k-- )
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
