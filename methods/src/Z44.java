class Z44
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=1;
		int j=test (i++); //i=i+1 ,j=1
		System.out.println("Main end: " + i +","+ j);
	}
	public static int test(int i)
	{
		System.out.println("From test: " + i );
		return i++;
	}
}