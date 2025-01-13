import java.util.Scanner;
class Area_Of_A_Circle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Program for Finding Area of a Circle");
		System.out.print("Enter the Radius	:	");
		float radius =sc.nextFloat();
		float area= (22/7)*radius*radius;
		System.out.println("Area of a Circle	:	"+area);
	}
}