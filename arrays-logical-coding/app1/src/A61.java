import java.util.Arrays;
class A61 
{
	public static void main(String[] args) 
	{
		int[] elements = {10,5,13,16,4,7,20,18};
		System.out.println("initial:" +Arrays.toString(elements));
		for (int i=elements.length-1;i>0;i--)
		{
			 elements[i] = elements[i-1];
		}
		System.out.println("final:" +Arrays.toString(elements));
	}
}
