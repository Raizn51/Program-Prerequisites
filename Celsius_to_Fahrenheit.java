import java.util.Scanner;
class Celsius_to_Fahrenheit
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Program for converting temperature from Celsius to Fahrenheit");
		System.out.print("Enter the temperature in Celsius	:	");
		float celsius =sc.nextFloat();
		float fahrenheit= (celsius * 9/5)+32;
		System.out.println("Celsius in Fahrenheit	:	"+fahrenheit);
	}
}