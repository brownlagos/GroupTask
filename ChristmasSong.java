

public class ChristmasSong{
    
    public void calLyricsOfSongs(){

                int i;

            for( i = 1; i <= 12; i++){

                System.out.println("on the ");

                switch(i){
                    case 12:
                    System.out.println("twelveth");
                    break;
            
                    case 11:
                    System.out.println("eleveth");
                    break;
            
                    case 10:
                    System.out.println("tenth");
                    break;
            
                    case 9:
                    System.out.println("nineth");
                    break;
            
                    case 8:
                    System.out.println("eighth");
                    break;
            
                    case 7:
                    System.out.println("seventh");
                    break;
            
                    case 6:
                    System.out.println("sixth");
                    break;
            
                    case 5:
                    System.out.println("fifth");
                    break;
            
                    case 4:
                    System.out.println("fourth");
                    break;

                    case 3:
                    System.out.println("third");
                    break;
            
                    case 2:
                    System.out.println("second");
                    break;
            
                    case 1:
                    System.out.println("first");
                    break;
            
            
                }
                
                    System.out.println("Days of christmass my true love gave to me");

                    switch(i){
                        case 12:
                        System.out.println("12 dru mmers drumming");
    
                        case 11:
                        System.out.println("11 pipers piping");
    
                        case 10:
                        System.out.println("10 lords a-leaping");
    
                        case 9:
                        System.out.println("9 ladies dancing");
    
                        case 8:
                        System.out.println("8 maids a-milking");
    
                        case 7:
                        System.out.println("7 swans a-swimming");
    
                        case 6:
                        System.out.println("6 geese a-laying");
    
                        case 5:
                        System.out.println("5 gold rings");
    
                        case 4:
                        System.out.println("4 calling birds");
    
                        case 3:
                        System.out.println("3 French hens");
    
                        case 2:
                        System.out.println("2 turtle doves");
    
                        case 1:
                        System.out.println("A partridge in a pear tree");

                }
                
        
            }
    
    }
public static void main(String[] args){
    ChristmasSong forme = new ChristmasSong();
    forme.calLyricsOfSongs();
    System.out.println();
}
 
}
