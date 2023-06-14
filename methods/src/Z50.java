class Z50
{
	public static void main(String[] args) 
	{
		System.out.println("Main begin");
		int i=1;
		int j=test1(++i)  +  i + test2(i++) + i + test3 (i++) + i + 
		test4 (++i) + i + test1 (i++) + i + test2 (++i) + i + test3 (++i) + i +
		test4 (i++) + i;
		//i=2,3,4,5,6,7,8,9
		//j=3+2+2+3+3+4+4+5+6+6+7+7+8+8+7+9 =84
		System.out.println("Main end: " + i + "," + j);
	}
	public static int test1(int i)
	{
		return ++i;
	}
	public static int test2(int i)
	{
		return i++;
	}
	public static int test3(int i)
	{
		return i--;
	}
	public static int test4(int i)
	{
		return --i;
	}
}