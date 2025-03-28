package Inheritance;

public class Main {
    public static void main(String []args){
        
        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.go();

        System.out.println(car.speed);
        System.out.println(bike.speed);
        System.out.println(bike.pedals);
        System.out.println(car.doors);



    }
    
}
