class F1 
{
	int i;
	F1(int i)
	{
		this.i=10;
		System.out.println("F1(int)");
	}
	public static void main(String[] args) 
	{
		F1 f1 = new F1(12);
		System.out.println(f1.i);
	}
}
