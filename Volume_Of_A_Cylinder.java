import java.util.Scanner;
class Volume_Of_A_Cylinder
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Program for Finding Volume Of A Cylinder");
		System.out.print("Enter the Radius	:	");
		float radius=sc.nextFloat();
		System.out.print("Enter the Height	:	");
		float height =sc.nextFloat();
		float volume= (22/7)*radius*radius*height;
		System.out.println("Volume of a Cylinder	:	"+volume);
	}
}