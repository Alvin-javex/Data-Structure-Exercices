
import java.util.Arrays;
public class ConjuntosDeInteiros{
    private final int [] number;
    
   
    ConjuntosDeInteiros(int [] a){
        this.number = a;
        Arrays.sort(number);
    }

    public boolean contem(int elemento ){
        return Arrays.binarySearch(this.number, elemento)>=0;

    }

    

    
}