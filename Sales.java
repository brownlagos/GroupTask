

import java.util.Scanner;

public class Sales {
	
	public void getSales() {

		int productNumb = 0;
		int quantitySold = 0;
		double price;
		double totalValue1 =0, totalValue2 =0,totalValue3 =0,totalValue4 =0,totalValue5 =0;
		
		Scanner input = new Scanner(System.in);
	
		
		
		for (int i = 1; i <=5; i++) {
		System.out.println("Enter ProductNumber (-1 to stop): ");
			productNumb = input.nextInt();
		
	
			if (productNumb == -1) {

				break;
			}
				else{
				System.out.println("Enter Quantity Sold (-1 to stop): ");
				quantitySold = input.nextInt();
				
 			
				switch(productNumb) {
					case 1:
						totalValue1 += (2.98 * quantitySold);
						break;
						
					case 2:
						totalValue2 += (4.50 * quantitySold);
						break;
						
					case 3:
						totalValue3 += (9.98 * quantitySold);
						break;
						
					case 4:
						totalValue4 += (4.49 * quantitySold);
						break;
						
					case 5:
						totalValue5 += (6.87 * quantitySold);
						break;
						
					default:
					

				}		
		}
		System.out.println("Total qantity Sold: " + quantitySold);

		double	totalValue = totalValue1 + totalValue2 + totalValue3 + totalValue4 + totalValue5;
				System.out.printf("Total value sold: %.2f%n", totalValue);
			
		}
			
	}	


	public static void main(String[] args){

		Sales calc = new Sales();
		calc.getSales();
	}
}
