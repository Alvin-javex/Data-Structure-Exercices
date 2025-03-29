package Interfaccee;

public class Main {
    public static void main(String [] args ){
    
    ByTwo bytwo = new ByTwo();
    
    Series eu = bytwo;

    System.out.println(Series.MAX);
    //bytwo.printStuff();Static method may be contain interface class only.
    eu.printStuff();
    
    /**for(int i = 0;i <6 ;i++){
        
        eu= bytwo;
        
        System.out.println(eu.getNext());

    }  */

    }
}
