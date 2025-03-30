package Generics;

public class Main {
    public static void main(String [] args){
        //Box<Integer> bid;
        //bid = new Box<>();
        Box<Integer>bid =new Box<>();
        bid.setItem(2);
        System.out.println(bid.getItem());
        
        Product<String,Double> product = new Product<>("apple ", 0.5);
        Product<String,Integer> product2 = new Product<>("ticket ", 15);
        
        System.out.println(product2.getSecond());
        System.out.println(product.getFirst());
    }

    
    
}
