public class Pie_Value{
     
    public void calPieValue(){
        double store = 0.0;
      //  double values;
       // System.out.printf("%s\t%s" ,values,numberofterms);
        double numberOfterms = 150_000.00;
        
        for(double j =1.0; j <= numberOfterms; j++ ){
            if( j == 1.0){
                store +=(4.0); 
            }else
            if(j % 2.0 == 0){
             store -=(4.0/(j + (j-1.0)));
            }
            else{
             store +=(4.0 /(j + (j-1.0)));
            }
            System.out.printf("%.1f\t%.7f%n", j,store);
        }
    }
    public static void main(String[] args){
        Pie_Value val = new Pie_Value();
        val.calPieValue();
    }
}