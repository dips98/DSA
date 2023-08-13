package MultiThreading;

import java.util.Scanner;

class Dance extends Thread {
    public void run() {
        System.out.println("Starting dancing !");
        try (Scanner sc = new Scanner(System.in)) {
            int step = sc.nextInt();
            for (int i = 0; i < step; i++) {
                System.out.println("Step : " + (i + 1));
            }
        }

    }
}

class Sing extends Thread {
    public void run() {
        try {
            System.out.println("Starting Singing !");
            int step = 50;
            
            for (int i = 0; i < step; i++) {
                Thread.sleep(1000);
                System.out.println("Pitch number : " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}



public class TwoThreading {
    public static void main(String[] args) {
        System.out.println("Main Thread!");
        Dance d =  new Dance();
        Sing s = new Sing();

        d.start();
        s.start();

    }
}
