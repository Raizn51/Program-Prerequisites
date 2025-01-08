import java.util.Scanner;
class Simple_Interest
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Program for Finding Simple Interest");
		System.out.print("Enter the Principle	:	");
		float principle=sc.nextFloat();
		System.out.print("Enter the Rate	:	");
		float rate =sc.nextFloat();
		System.out.print("Enter the Time	:	");
		float time =sc.nextFloat();
		float SI= (principle*rate*time)/100;
		System.out.println("Simple Interest	:	"+SI);
	}
}