class A50 
{
	public static void main(String[] args) 
	{
		for (char i='P';i<='T' ;i++ )
		{
			for (char j=i;j>='P' ; j--)
			{
				System.out.print((j=='P' || j==i) ? (j +" "): "0 ");
			}
			System.out.println();
		}
	}
}
