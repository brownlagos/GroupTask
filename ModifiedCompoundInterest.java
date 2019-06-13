package exercises.fiveThree;

import java.util.Scanner;

public class ModifiedCompoundInterest {

	public static void main(String[] args) {
		
		//Calculating compound interest for 5% rate for the first 10 years
		double store = 1.0;
		
		// Variable to store the dollar
		int dollar = 0;
		
		//Variable to store the cent
		int centValue = 0;
		
		//Calculate the amount.
		double amount = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		//Prompt the user to input the input the number of years and the rate
		System.out.print("Input the rate,principal and the number of years simultaneously: ");
		double rate = (double)input.nextInt()/100;
		int principal = input.nextInt();
		int num = input.nextInt();
		
		//Loop through the compound interest
		System.out.printf("%s\t%s%n","Year","Interest");
		for(int i = 1; i <= num; i++) {
			
			store *= (1 + rate);
			
			amount = ((principal * 100) * store);
			
			//To get the dollar from the amount
			dollar = (int)amount / 100;
			
			//To get the cent
			centValue = (int)amount % 100;
			
			System.out.printf("%d\t$%d.%dc%n", i,dollar,centValue);
			
		}
		

		
	}

}
