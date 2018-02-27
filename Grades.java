import java.util.Scanner;

public class Grades {
	public static void main(String[] args){

	double ex1, ex2, ex3, avg;
	Scanner input = new Scanner(System.in);

		System.out.println("Exam 1 score: ");
		ex1 = input.nextDouble();

		System.out.println("Exam 2 score: ");
		ex2 = input.nextDouble();

		System.out.println("Exam 3 score: ");
		ex3 = input.nextDouble();


		avg = (ex1 + ex2 + ex3)/3;

			if(avg >= 90)
			System.out.println("A");

			else if (avg >= 70 && avg < 90)
			System.out.println("B");

			else if (avg >= 50 && avg < 70)
			System.out.println("C");

			else if (avg < 50)
			System.out.println("F");

			else
			System.out.println("Invalid Grade.");

	}
}
