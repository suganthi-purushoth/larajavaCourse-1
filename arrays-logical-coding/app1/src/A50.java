import java.util.Arrays;
class A50 
{
	public static void main(String[] args) 
	{
		int[] elements = {10,5,13,16,4,7,20,18};
		System.out.println("initial:" +Arrays.toString(elements));
		for (int i=0;i<elements.length ;i++ )
		{
			if (i<elements.length/2)
			{
				elements[i] = elements[i] +5;
			}
			else
			{
				elements[i] = elements[i] -10;
			}
		}
		System.out.println("final:" +Arrays.toString(elements));
	}
}
