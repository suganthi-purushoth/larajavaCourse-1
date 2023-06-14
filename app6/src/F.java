class F 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = i++ + i + i++ + i + i++ + i;
		//  j = 0   + 1 + 1   + 2 + 2   +(3)  = 9
		System.out.println(i);
		System.out.println(j);
		System.out.println("-------------");
		int m = 0;
		int n = ++m + m + m++ + m + ++m + m + m++ + m;
		//  n = 1   + 1 + 1   + 2 + 3   + 3 + 3   +(4)  = 18
		System.out.println(m);
		System.out.println(n);
		System.out.println("-------------");
	}
}
