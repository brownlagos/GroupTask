//SmallestValue

    import java.util.Scanner;

        public class SmallestValue{

            public int findSmallestValue(){

                Scanner input = new Scanner(System.in);
                System.out.print("How many inputs do you want to compare: ");

                int number = 0;
		        int count = 1;
		        int lowest = 0;
		
		        while(input.hasNext()) {
			System.out.println("Enter number: ");
			    number = input.nextInt();
			    if(number < lowest) {
				lowest = number;				
			}
			count++;

    
                }
            return lowest;
            }

                public static void main(String[] args){

                    SmallestValue calc = new SmallestValue();
                    System.out.println( calc.findSmallestValue());
                }
            
        }