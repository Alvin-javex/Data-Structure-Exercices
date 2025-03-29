package Interfaccee;

public class ByTwo implements SeriesSub{
    
    int value;
    
    @Override
    public  int getNext() {
        if(value>= MAX){
            System.out.println(ERROMSG);
        
        }else{
            value+=2;
        }
        return value;


        
    }

    @Override
    public int getPrev() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
   

    
}
