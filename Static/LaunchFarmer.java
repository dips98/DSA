package Static;

import java.util.Scanner;

class Farmer {
    int pa;
    float td;
    static float ri;
    float si;

    static{
        ri = 8.5f;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please mention the amout of interest");
        pa = sc.nextInt();
        System.out.println("Please Enter the time duration");
        td = sc.nextFloat();
    }

    void compute(){
        si = pa*ri*td/100f;
    }

    void Display(){
        System.out.println("The simple intrest is "+si);
    }
}

public class LaunchFarmer {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.Display();
        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.Display();
    }
}
