//OddNumber.java

public class OddNumber{
    
    public void multiplyOdd(){

      int  oddNumber;
      int i=0;
    //   int counter =  1;

      for(int i = 1;i<=15;i += 2){
            oddNumber = i;
            int odd = oddNumber * i;
            System.out.println(oddNumber);
            System.out.println(odd);
          }
      }
    public static void main(String[] args){
        OddNumber calc = new OddNumber();

        calc.multiplyOdd();
    }
}