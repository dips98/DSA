package Collections.ArrayList;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        // arr.add("HI"); You cant add we can make arraylist int staring char as we wanted else it can be accept any data type include array itself 
        arr.ensureCapacity(20);
        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(arr);
        System.out.println(arr.contains(3));
        System.out.println("index of number 3 is :"+arr.indexOf(3));
        System.out.println("Size of array :"+ arr.size());
        arr.trimToSize();
        System.out.println(arr.size());

    }
}
