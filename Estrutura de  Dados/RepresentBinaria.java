public class RepresentBinaria 
{
    public static void main(String [] args)
    {
        representBinaria(12);

    }
    public static void representBinaria(int n )
    {
        if( n< 2){
            System.out.print(n);
        }
        else
        {
            representBinaria(n/2);
            System.out.print(n%2);

        }



    }
    
//As chamadas recursivas seriam floor(log2(n)+1)   
}
