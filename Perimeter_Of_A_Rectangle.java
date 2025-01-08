import java.util.Scanner;
class Perimeter_Of_A_Rectangle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Program for Finding Perimeter of a Rectangle");
		System.out.print("Enter the Length	:	");
		float length=sc.nextFloat();
		System.out.print("Enter the Width		:	");
		float width =sc.nextFloat();
		float perimeter= 2*(length+width);
		System.out.println("Perimeter of a Rectangle	:	"+perimeter);
	}
}