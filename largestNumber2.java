import java.util.Scanner;

public class LargestNumber2{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       // System.out.println("Enter all the VAlue here: ");
        int number = 0;
       // input.hasNext()
        int count = 1;
        int largestnum = 0;
    
        while(count <= 10){
         System.out.println("Enter the numbers: ");
        number = input.nextInt();

        if(number > largestnum){
        largestnum = number;
        }
        count++;
        
        }
           System.out.print("The largest number of all the values input are: " + largestnum + "\n");
           input.close();     
        }
    }
 
