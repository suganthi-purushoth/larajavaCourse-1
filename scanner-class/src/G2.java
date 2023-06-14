import java.util.Scanner;
class G2
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter student information: ");
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter your roll number: ");
		int  roll= sc.nextInt();
		sc.nextLine();
		System.out.println("Please enter your name: ");
		String name = sc.nextLine();
		System.out.println("Please enter your initials: ");
		char initials=sc.next().charAt(0);
		//sc.nextLine();
		System.out.println("Please enter your age: ");
		short  age= sc.nextShort();
		//sc.nextLine();
		System.out.println("Please enter Student enrolled course : ");
		String course = sc.next();
		sc.nextLine();
		System.out.println("Please enter Student skills:");
		String  skills= sc.nextLine();
		System.out.println("Please enter Student total fees:");
		double fees= sc.nextDouble();
		//sc.nextLine();
		System.out.println("job offer status:");
		boolean job_offer=sc.nextBoolean();
		System.out.println("job offer2 status:");
		boolean job_offer2=sc.nextBoolean();
        System.out.println("-------------------------------------------");
		System.out.println("student details: "+"roll: "+roll+"name: "+name+"age: "+age+"course: "+course+"skills: "+skills+"fees: "+fees+"job_offer: "+ job_offer);	
	}
}
