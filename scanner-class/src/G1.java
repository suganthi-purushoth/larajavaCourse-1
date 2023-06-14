import java.util.Scanner;
class G1
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter first int value: ");
		Scanner sc= new Scanner(System.in);
		int  i= sc.nextInt();
		System.out.println("Please enter second int value: ");
		int  j= sc.nextInt();
		System.out.println("Please enter third int value: ");
		int  k= sc.nextInt();
		System.out.println("Addition value is:"+ (i+j+k));
	}
}
