class A45 
{
	public static void main(String[] args) 
	{
		for (char i='A';i<='F' ;i++ )
		{
			for (char j=i;j>='A' ; j--)
			{
				System.out.print((i=='C' && j=='A') ? "C ":(j +" "));
			}
			System.out.println();
		}
	}
}
