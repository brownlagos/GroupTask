//TriangleOfAsterick

public class TriangleOfAsterick{

        public void CreateAsterick(){
    
           int counter =1;
            
            for (int i = 1; i <=10; i++){
                for(int j = 1; j <= i; j++){
                  System.out.printf("%s","*"); 
                }
        
            System.out.println();
            }
            System.out.println();
            System.out.println();
            for(int i = 10; i >=0; i--){
                for(int j = i; j >=0; j--){
                    System.out.printf("%s","*");
                }
                System.out.println();
            }
            for(int y = 1; y<=10; y++){
                for(int j = 1; j <= y; j++){
                    System.out.printf("%s","*"); 
           
             }
             System.out.println();
        }
    }
    
        public static void main(String[] args){

            TriangleOfAsterick calc = new TriangleOfAsterick();
            calc.CreateAsterick();
        }
}