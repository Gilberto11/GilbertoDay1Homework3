import java.util.Scanner;

public class Homework3Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//declare variables
		double x,y,sum,diff,prod,div;
		//ask the user to enter a number
		System.out.println("Please enter a number");
		//read in the first number into the variable x
		x = input.nextDouble();
		//ask the user to enter another number
		System.out.println("Please enter another number");
		//read the next number into y
		y = input.nextDouble();
		//calculate the sum,prod,diff,div
		sum = x + y;
		prod = x * y;
		diff = x - y;
		div = x / y;
		
		//output the result
		
		System.out.println("The sum is:" +sum);
		System.out.println("The prod is:" +prod);
		System.out.println("The diff is:" +diff);
		System.out.println("The div is:" +div);

	}

}
