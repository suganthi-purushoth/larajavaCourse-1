class A23 
{
	public static void main(String[] args) 
	{
		for (int i=0;i<=5 ;i++ )
		{
			for (char j='A';j<='F' ;j++ )
			{
				char k = (char)(j+i);
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
