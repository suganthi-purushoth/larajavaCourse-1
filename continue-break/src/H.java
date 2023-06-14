class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i<= 10; i++)
		{
			System.out.println("loop body begin: "+ i);
			if(i==4)
			{
				System.out.println("if begin");
				break;continue; //(both is not possible)
				
			}
			System.out.println("loop body end: "+ i);
		}
		System.out.println("main end");
	}
}
