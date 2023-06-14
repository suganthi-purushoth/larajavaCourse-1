class NO
{
	public static void main(String[] args) 
	{
		int[] array = {1,7,2,6,9,14,37,11,21,14,18,24,1,0,3,4,5};     
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int max4 = Integer.MIN_VALUE;
		int max5 = Integer.MIN_VALUE;
		for (int i =0;i<array.length;i++)
		{
			if (array[i] > max1)
			{
				max5=max4;
				max4=max3;
				max3 = max2; 
				max2 = max1; 
				max1 = array[i];
			}
			else if (array[i] > max2)
			{
				max5=max4;
				max4=max3;
				max3 = max2; 
				max2 = array[i];
			}
			else if(array[i] > max3)
			{
				max5=max4;
				max4=max3;
				max3 = array[i];
			}
			else if(array[i] > max4)
			{
				max5=max4;
				max4 = array[i];
			}
			else if(array[i] > max5)
			{
				max5 = array[i];
			}
		}
		System.out.println("5th max : " + max5);
		System.out.println("4thmax : " + max4);
		System.out.println("3rd max : " + max3);
		System.out.println("2nd max : " + max2);
		System.out.println("1st max : " + max1);
	}
}

