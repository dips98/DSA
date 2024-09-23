package Collections.Graph;

import java.util.ArrayList;

public class Graph {
    
    public static void main(String[] args) {
        int n = 3 , m = 3;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        System.out.println("After adding"+adj.toString());
    }
}
