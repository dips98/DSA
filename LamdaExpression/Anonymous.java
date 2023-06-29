package LamdaExpression;

interface Car{
    void drive();
}

class Waganar implements Car{
    public void drive(){
        System.out.println("Waganar Driving ");
    }
}

public class Anonymous {
    public static void main(String[] args) {
        // Car obj = new Waganar();
        // Waganar obj = new Waganar();
        // obj.drive();

        // Now we are creating anonymous inner class

        // Car obj = new Car(){
        //     public void drive(){
        //         System.out.println("Driving");
        //     }
        // };

        //  This is called anonymous inner class.

        // This is called Lamda expression
        Car obj = () -> {
            {
                System.out.println("Driving");
            }
        };
        obj.drive();
       
    }
}
