class A80 
{
	public static void main(String[] args) 
	{
		for (char i='V';i>='P' ;i-- )
		{
			for (char j='V';j>i ;j-- )
			{
				System.out.print("  ");
			}
			for (char k='P';k<=i ;k++ )
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
