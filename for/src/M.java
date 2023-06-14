class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for(; ;)  //checking boolean become true only
		{
			System.out.println("loop body: "+ i);
			i++;
		}
		//System.out.println("main end:" + i);
	}
}
