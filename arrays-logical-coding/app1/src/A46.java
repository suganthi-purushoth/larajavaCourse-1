class A46
{
	public static void main(String[] args) 
	{
		int[] array = {-4,5,6,7,9,-5,4,3,1,8};
		//                   0 1 2 3 4   5 6 7 8 9 
		for (int i=0;i< array.length-1 ;i++ )
		{
			for (int j=i+1;j<array.length ;j++ )
			{
				for (int k=j+1;k<array.length ;k++ )
				{
					if (((array[i] ) + (array[j]) +(array[k])) == 0)
					{
						System.out.print(array[i] + ",");
						System.out.print(array[j] + ",");
						System.out.print(array[k] + ",");
						System.out.println();
					}
				}
			}
		}
	}
}
