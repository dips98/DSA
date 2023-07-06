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

        for(int i:arr){
            System.out.println(i);
        }
        System.out.println(arr);

    }
}
