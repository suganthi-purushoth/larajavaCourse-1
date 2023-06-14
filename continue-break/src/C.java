class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i<= 10; i++)
		{
			System.out.println("loop body begin: "+ i);
			if(i<=4)
			{
				continue;
			}
			System.out.println("loop body end: "+ i);
		}
		System.out.println("main end");
	}
}
