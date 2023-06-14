import java.util.Arrays;
class A56 
{
	public static void main(String[] args) 
	{
		int[] elements = {10,5,13,16,4,7,20,18};
		System.out.println("initial:" +Arrays.toString(elements));
		int temp;
		for (int i=0;i<elements.length ;i++)
		{
			elements[i] =2*i;	
		}
		System.out.println("final:" +Arrays.toString(elements));
	}
}
