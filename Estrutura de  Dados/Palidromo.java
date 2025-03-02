public class Palidromo{
    public static void main(String [] args){
    System.out.println(isPalidrome("racecar"));


    }
    public static boolean isPalidrome(String input){
        if(input.length()==0 || input.length()== 1){
            return true;
        }


        if(input.charAt(0)== input.charAt(input.length()-1)){
            return isPalidrome(input.substring(1,input.length()-1));

        }
        return false;

    }
}