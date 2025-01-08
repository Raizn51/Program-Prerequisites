import java.util.Scanner;
class Add_Two_Numbers
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number	:	");
		int first_no=sc.nextInt();
		System.out.print("Enter the Second Number	:	");
		int second_no=sc.nextInt();
		System.out.println("Result	:	"+(first_no+second_no));
	}
}