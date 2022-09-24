package lab_2;
import java.util.Scanner;

//	PROGRAM TO MAKE A LIST FOR STUDENTS FOR PASS, FAIL AND TOPPERS.
//	STRATEGY : Make an array of number of students; input every students subjects and marks

public class exp3 {
	public static void main(String[] args)	{
		System.out.println("");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students in the class");
		int num = input.nextInt();
		int marks[] = new int[num];
		int maths[] = new int[num];
		int sci[] = new int[num];
		for(int i=0; i<num; i++) {
			System.out.printf("\nSTUDENT %d:\n", (i+1));
			System.out.print("\tEnter your marks in Maths - ");
			maths[i] = input.nextInt();
			System.out.print("\tEnter your marks in Science - ");
			sci[i] = input.nextInt();
		}
		for(int i=0; i<num; i++) {
			System.out.printf("\n\n\nMarks of STUDENT %d:\n", (i+1));
			System.out.printf("\tMarks in Maths: %d\n", maths[i]);
			System.out.printf("\tMarks in Science: %d\n", sci[i]);
			marks[i] = (maths[i]+sci[i]) / 2;
			System.out.printf("\n\tAverage Marks: %d\n", marks[i]);
		}
		input.close();
	}
}
