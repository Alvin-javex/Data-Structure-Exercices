import java.util.Random;
public class datagrows {
    public static void main(String[] args)
    {
        int [] testValues = {10000, 20000,40000,8000,160000,320000};

        System.out.println("Testando concatenação com String (+)...");
        
        for(int n : testValues)
        {
            double time = tesStringConcat(n);
            System.out.println("n = " + n +"-> Tempo "+ time +" segundos");
        }

        System.out.print("\nTestando StringBuilder...");
        for(int n: testValues)
        {
            double time = testStringBuilder(n);
            System.out.print (" n = "+ "Tempo: ->"+ time + " segundo");
        }

    }
    public static double tesStringConcat(int n)
    {
        StopWatch sw = new StopWatch(); // O conometro cmc a contar
        Random rd  = new Random();

        String s = " ";

        for (int i = 0; i <n; i++)
        {
            s+= rd.nextBoolean() ? "0" : "1";
        }
        return sw.elapsedTime();
    }

    public static double testStringBuilder(int n)
    {
        Stopwatch sw = new StopWatch();
        Random rd = new Random ();

        StringBuilder sb = new StringBuilder ();

        for (int i = 0; i<n; i++)
        {
            sb.append(rd.nextBoolean() ? "0" : "1");
        }
        return sw.elapsedTime();


    }


}