import java.util.Scanner;

public class TaxCalculator{
    
    private int housing,food,clothing,transportation,healthCare,education,vacation;

   // public TaxCalculator(int housing,int food,int transportation,int healthcare,int education,int vacation){
      //  this.housing = housing;
       // this.food = food;
      //  this.transportation = transportation;
       // this.heaalthcare = healthcare;
       // this.education = education;
       // this.vacation = vacation;
    
    public void calculateTax(){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Housing value: ");
    housing = input.nextInt();

    System.out.println("Enter food value: ");
    food = input.nextInt();
    System.out.println("Enter Transportation val: ");
    transportation = input.nextInt();

    System.out.println("Enter Healthcare val: ");
    healthCare = input.nextInt();

    System.out.println("Enter Education val: ");
    education = input.nextInt();

    System.out.println("Enter Vacation val: ");
    vacation = input.nextInt();

    System.out.println("Enter %: ");
    double percent = (double)input.nextDouble()/100;
        int numOfItem = 1;
        int a = 1; 
    while(a < 2){
        double tax1 = 0;
        double tax2 = 0;
        double tax3 = 0;
        double tax4 = 0;
        double tax5 = 0;
        double tax6 = 0;

        double total1 = 0;
        double total2 = 0;
        double total3 = 0;
        double total4 = 0;
        double total5 = 0;
        double total6 = 0;

        double total= 0.0;
    
        //= percent * num;                                                   
         

        switch(numOfItem){
            case 1:
            tax1 = percent * (double)housing;
            total1 +=tax1;
            System.out.println("Total tax for housing is: " + total1);
            

            case 2:
            tax2 = percent *  (double)food;
            total2 +=tax2;
            System.out.println("Total tax for food is: " + total2);
            

            case 3:
            tax3 = percent *  (double)transportation;
            total3 +=tax3;
            System.out.println("Total tax for Transportation is: " + total3);
            

            case 4:
            tax4 = percent *  (double)education;
            total4 +=tax4;
            System.out.println("Total tax for Education is: " + total4);
            

            case 5:
            tax5 = percent * (double) healthCare;
            total5 +=tax5;
            System.out.println("Total tax for Healthcare is: " + total5);
            

            case 6:
            tax6 = percent *  (double)vacation;
            total6 +=tax6;
            System.out.println("Total tax for vacation is: " + total6);
            

        }
        a++; numOfItem++;
        if(numOfItem == 1){
            break;
        }
        total = total1 + total2 + total3 + total4 + total5 + total6;
        System.out.println(total);
    }
    
    
}
public static void main(String[] args){
    TaxCalculator mine = new TaxCalculator();
    mine.calculateTax();    
        
}
   
    
    
   
    
    
}
