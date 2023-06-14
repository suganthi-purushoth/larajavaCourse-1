class A47 
{
	public static void main(String[] args) 
	{
		int[] array = {3,5,6,8,9,2,4,8,1,0};
		//                  0 1 2 3 4 5 6 7 8 9 
		for (int i=0;i<array.length ;i++ )
		{
			for (int j=0,k=0;j<array.length;j++)
			{
				int a = array[j] -1;
				int b = array[k] +1;
				while (j<array.length)
				{
					if (a==array[i])
					{
						System.out.println(array[i]);
					}
					else if (b==array[i])
					{
						System.out.println(array[i]);
					}
					i++;
				}
			}
		}
	}
}
