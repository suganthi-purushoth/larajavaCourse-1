class Z51 
{
	public static void main(String[] args) 
	{
		int i=1;
		int j= test1(i++,true) + i + test1(++i,true) + i +
			test1(i++,false) + i +
			test2(i++,false) +i + test2(++i,false) + i + 
			test2(i++,true) + i;
		//i=2,3,4,5,6,7
		//j=1+2+3+3+4+4+4+5+6+6+7+7 =52
		System.out.println(i);
		System.out.println(j);
	}
	static int test1(int i, boolean flag)
	{
		return flag ? i++ : ++i;
	}
	static int test2(int i, boolean flag)
	{
		return flag ? ++i : i++;
	}
}
