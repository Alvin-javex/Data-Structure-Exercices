import java.util.Random;
import java.util.Scanner;
public class test{
    public static void main(String []args){
        try (Scanner in = new Scanner(System.in)){    
            System.out.println("Digite o seu roll! :");
            Random random = new Random();
            String scanner = in.nextLine();
            int n = 6;
            
            while(scanner.equals("roll")){
                System.out.println("Digite roll! :");
                scanner = in.nextLine();
                if(scanner.equals("roll")){
                    int value = random.nextInt(n)+1;
                    
                    System.out.println("your result is:"+value);
                }
            }
        }
    }
    
}