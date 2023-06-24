package Oops;

 abstract class Aeroplane { // parent class methods become inherit method to child class
    abstract public void takeOff();

    abstract public void fly();
    // In 100% abstract class all method should be abstract
    void landing(){  // Due to this method the class is not 100% abstract class
        System.out.println("Plane is Landing!");
    }
}

class CargoPlane extends Aeroplane {
    public void takeOff() { // Defining same method name of inhert method in child class is called
        // over-riding method
        System.out.println("Cargo plane is getting takeoff!");
    }

    public void fly(){
        System.out.println("Fly Cargo plane");
    }

    void carryGoods() { // Defined new method in child class is called specialised method
        System.out.println("Carrying goods!");
    }

    void turbulance(){
        System.out.println("Getting turbulance in Cargo");
    }
}

class PassengerPlane extends Aeroplane {
    public void takeOff() { // Defining same method name of inherit method in child class is called
        // over-riding method
        System.out.println("Passenger plane is getting takeoff!");
    }

    public void fly(){
        System.out.println("Fly Cargo plane");
    } 

    void carryPassenger() { // Defined new method in child class is called specialised method
        System.out.println("Carrying passengers!");
    }
}

class FighterPlane extends Aeroplane {
    public void takeOff() { // Defining same method name of inherit method in child class is called
        // over-riding method
        System.out.println("Fighter plane is getting takeoff!");
    }

    public void fly(){
        System.out.println("Fly Cargo plane");
    }

    void carryPassenger() { // Defined new method in child class is called specialised method
        System.out.println("Fighter passengers!");
    }
}

class Airport {
    void poly(Aeroplane ref) {
        ref.takeOff();
        ref.fly();
        System.out.println("------------------------------------------------");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

        Aeroplane aa = new CargoPlane();
        ((CargoPlane) aa).turbulance(); // casting to a same  class object
        // Aeroplane A = new Aeroplane(); // Can not make object of abstraction class
    }
}
