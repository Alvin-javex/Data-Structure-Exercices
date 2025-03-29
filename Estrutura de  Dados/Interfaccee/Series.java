package Interfaccee;

public interface Series {
    int MAX = 10;
    String ERROMSG = "Cannot go above value: "+ MAX;
    int  getNext();

    default  void printStuff(){
        
        System.out.println("Live from New York. It´s Saturnday night");
        printMoreStuff();
    }
    
    private  void printMoreStuff(){
        System.out.println(" More stuff");
    }
}
