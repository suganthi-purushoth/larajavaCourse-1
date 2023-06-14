class A25 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=4 ;i++ )
		{
			for (char j='F';j>='A' ;j-- )
			{
				char k = (char)(j+i);
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
