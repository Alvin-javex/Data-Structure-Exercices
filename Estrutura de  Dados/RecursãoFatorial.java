public class RecursãoFatorial{
    public static void main (String []args){
        int k = 5;
        System.out.print(fatorial(k));



    }

    public static long fatorial(int n){
        return n == 0?
            1 :
            n * fatorial(n-1);
    

    }
}
