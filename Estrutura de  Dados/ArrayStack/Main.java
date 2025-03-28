package ArrayStack;

public class Main {
    public static void main(String [] args){
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Topo antes do pop " + stack.peek());
        System.out.println("Elemento removido " + stack.pop());
        System.out.println("Novo topo "+ stack.peek());



    }
}
