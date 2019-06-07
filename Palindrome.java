import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the 5 digit: ");
        int digit = input.nextInt();

        int store = 0;
        int remainder;
       

       int initialnumb = digit;

             while(digit > 0)
             {

            remainder =  digit % 10;
            store =( store * 10 )+ remainder;
            digit = digit/10;
        
            }
            System.out.println(store);

            if(store == initialnumb){
                System.out.print(store + " is a palindrome: " + "\n" );
            }
            else
                System.out.print(store + " error message Try another number: " + "\n");
               
                input.close();

            
                        
    }
}
    
