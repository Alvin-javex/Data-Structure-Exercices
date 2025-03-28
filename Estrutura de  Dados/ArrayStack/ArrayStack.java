package ArrayStack;
public class ArrayStack
{
    private final int [] stack; //Array que armazena os elementos
    private  int  top; // Indice do topo da pilha
    private final  int capacity; // Capacidade máxima da pilha

    /**
     * 
     * @param size size of array that will be criated
     */
    public ArrayStack(int size)
    {
        stack = new int[size]; //cria um array fixo
        capacity  = size;
        top = -1; //Show when stack in empty
    }

    /**
     * Method to add a element to array(push)
     */
    public void push(int value)
    {
        if(top == capacity -1)
        {
            System.out.println("Stack Overflow"); // pilha cheia
            
        }
        stack[++top] = value; // adiciona no topo

    }

    /**
     * Method to remove one element above stack. 
     */
    public int pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    /**
     * 
     * @return
     */
    public int peek()
    {
        if(top == -1 )
        {
            System.out.println("Stack is empty!");
        }
        return stack[top];

    }
    public boolean isEmpty()
    {
        return top == -1;
    }
}
