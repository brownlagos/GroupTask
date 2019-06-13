
package chapter5.exercise5_13;

public class Factorial {
	public void getFactorial() {
		int counter = 1;
		long fact = 1;		
//		for (int i = 1; i <= 20; i++) {
//			fact = fact * i;
//			System.out.println(fact);
//		}
		
		System.out.println("Factorial		" + "Result");	
		System.out.println();
			do {
				fact = fact * counter;
					
				System.out.println(counter + "!"+ " 			"  + fact);
				counter++;
			}
			while(counter <=20);
	}
}