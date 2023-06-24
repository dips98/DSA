package Oops.Polymorphism;

class Aeroplane { // parent class methods become inherit method to child class
    void takeOff() {
        System.out.println("Taking off!");
    }

    void fly() {
        System.out.println("Going to fly!");
    }
}

class CargoPlane extends Aeroplane {
    void takeOff() { // Defining same method name of inhert method in child class is called
                     // over-riding method
        System.out.println("Cargo plane is getting takeoff!");
    }

    void carryGoods() { // Defined new method in child class is called specialised method
        System.out.println("Carrying goods!");
    }
}

class PassengerPlane extends Aeroplane {
    void takeOff() { // Defining same method name of inherit method in child class is called
                     // over-riding method
        System.out.println("Passenger plane is getting takeoff!");
    }

    void carryPassenger() { // Defined new method in child class is called specialised method
        System.out.println("Carrying passengers!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        Aeroplane ref;
        ref = cp;
        ref.takeOff();
        ref.fly();
        ref = pp;
        System.out.println("----------------------------------");
        ref.takeOff();
        ref.fly();
    }
}
