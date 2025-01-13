import java.util.Scanner;
class CalculateAverageOfThreeNumbers
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Program for Calculate Average of Three Numbers");
		System.out.print("Enter the First Number	:	");
		int first_no=sc.nextInt();
		System.out.print("Enter the Second Number	:	");
		int second_no=sc.nextInt();
		System.out.print("Enter the Third Number	:	");
		int third_no=sc.nextInt();
		float average=(first_no + second_no + third_no)/3;
		System.out.println("Average of Three Numbers	:	"+average);
	}
}