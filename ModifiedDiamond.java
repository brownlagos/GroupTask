import java.util.Scanner;
public class ModifiedDiamond{
    
    public void totalDiamondVal(){
       Scanner input = new Scanner(System.in);
        //int n = 1 ;
        //int a = 5;
        int b = 1;
        


        System.out.println("Enter the number of rows");
       int k = input.nextInt();
       int core = k/2;
       int a = k;


       for(int n = 1; n<=k; n++){

        for(int j = a; j > 0; j--){
            System.out.print(" ");
        }
        for(int i = b; i > 0; i--){
            System.out.print("*");
            
        }
         System.out.println();
           if (n>core){

               b -=2;
               a +=1; 
           }
           else{
               b +=2;
               a -=1;
    
               }
        

            }
        
    }
    public static void main(String[] args){
        ModifiedDiamond val2 = new ModifiedDiamond();
        val2.totalDiamondVal(); 
    }
}