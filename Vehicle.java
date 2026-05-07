class Vehicle{
    int speed=50;
    Vehicle(){
        System.out.println("Vehicle Created...");
    }
    void display(){
        System.out.println("Vehicle display...");
    }
}
class Car extends Vehicle{
    int speed=100;
    Car(){
        super();
        System.out.println("Car created...");
    }
    void display(){
        System.out.println(speed);
        System.out.println(super.speed);
        super.display();
    }
}