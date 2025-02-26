public class Inversa {
    public static void main (String [] args ){
        String a = "Alvinho";


        int indice = 4;

        System.out.print (inversa(a, indice).toString());




    }


    public static StringBuilder inversa(String s, int indice) {
       
            if (indice < 0){
                return new StringBuilder();

            }
            StringBuilder sb = inversa(s,indice-1);
            sb.insert(0,s.charAt(indice));
            return sb;



            
            
            
            

        
        
        

    }

    
}
