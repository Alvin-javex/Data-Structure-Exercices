package Generics;
public class Product<T,U>{
    T first;
    U second;

    public Product(T first,U second ) {
        this.first = first;
        this.second = second;

    }
    
    public T getFirst(){
        return this.first;
    }

    public U getSecond(){
        return this.second;


    }
 
}