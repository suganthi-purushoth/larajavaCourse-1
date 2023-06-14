/*
given number is 344523 ==325443
read 445 from the above number
*/

class EX6 
{
	public static void main(String[] args) 
	{
		int i=344523;
		System.out.println((i/100)%1000 );
		System.out.println((i%100000)/100 );
	}
}