package lab_2;
import java.util.Scanner;

public class exp4 {
	public static void main(String args[])	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		float a = input.nextFloat();
		float b = input.nextFloat();
		float sum, sub, mul, div;
		System.out.println("Enter the operator to be used:");
		String o = input.next();
		
		if(o.equals("+"))	{
			sum = a+b;
			System.out.printf("\nSum = %f", sum);
		}
		else if(o.equals("-"))	{
			sub = a-b;
			System.out.printf("\nSum = %f", sub);
		}
		else if(o.equals("*"))	{
			mul = a*b;
			System.out.printf("\nMul = %f", mul);
		}
		else if(o.equals("/"))	{
			div = a/b;
			System.out.printf("\nDivision = %f", div);
		}
		else	{
			System.out.println("\nERROR! TRY AGAIN.\n");
		}
		input.close();
	}
}
