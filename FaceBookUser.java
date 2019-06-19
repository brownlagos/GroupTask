import java.util.Scanner;
public class FaceBookUser{

    public void calFacebookUser(){
         double principal = 1000_000_000;
        Scanner input = new Scanner(System.in);

       // System.out.println("Enter the number of Month: ");
         double numberOfMonth;
        double rate = 4;
        // System.out.println("Enter the Rate: ");
        double storeRate =1 + (rate / 100);

         for(numberOfMonth = 1; numberOfMonth > 0; numberOfMonth++){
            double totalUser = principal * Math.pow(storeRate,numberOfMonth);
            
            if(totalUser >= 1500_000_000){
                System.out.printf("User base would be: %,.2f And the number of Months is: %.1f%n",
                totalUser,numberOfMonth);
            }
            if(totalUser >= 2000_000_000){
                System.out.printf("User base would be: %,.2f And the number of Months is: %.1f%n",
                totalUser,numberOfMonth);
                break;
            }

         }
        // System.out.println(totalUser); 
    }
public static void main(String[] args){
    FaceBookUser myaccount = new FaceBookUser();
    myaccount.calFacebookUser();
}
     
}