
import java.util.Scanner;

public class SquareHallow {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of square sides");
		int stars = input.nextInt();
		
		int row = 1;
		
		while(row <= stars){
		
			int column = 1;
			
			while(column <= stars)
			{
				if(row == 1)
				{
					System.out.print("*");
				}
				
				else if(row == stars) {
					System.out.print("*");
				}
				else if(column == 1)
				{
					System.out.print("*");
				}
				else if(column == stars)
				{
					System.out.print("*");
				}
				else System.out.print(" ");	
				
				column++;
			}
			System.out.println();
			row++;
		}
	}

}
