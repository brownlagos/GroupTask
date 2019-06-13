//BarChart
import java.util.Scanner;

public class BarChart{

    int number1 = 0;
    int number2 = 0;
    int number3 = 0;
    int number4 = 0;
    int number5 = 0; 

        public void displayBarChart(){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter number between 1 and 30: ");
    number1 = input.nextInt();

    System.out.println("Enter any number between 1 and 30: ");
    number2 = input.nextInt();

    System.out.println("Enter number between 1 and 30: ");
    number3 = input.nextInt();

    System.out.println("Enter any number between 1 and 30: ");
    number4 = input.nextInt();

    System.out.println("Enter any number between 1 and 30: ");
    number5 = input.nextInt();

    int m =0;
            for(int i = 1; i<= 5; i++){
                if (i == 1)
                    m = number1;
                if(i == 2)
                    m = number2;
                if(i == 3)
                    m = number3;
                if(i == 4)
                    m =number4;
                if(i == 5)
                    m = number5;
             for(int j = m; j > 0; j--)
             {
                System.out.print("*"); 
             }
                  System.out.println();
        }

    
    

        }

         public static void main(String[] args){
                BarChart calc = new BarChart();
                calc.displayBarChart();
            }
    }