package Collections.Graph;

import java.util.ArrayList;

import javafx.util.Pair;

public class GraphWeigth {
    
    public static void main(String[] args) {
        int n = 3, m = 3;
        ArrayList<ArrayList<Pair<Integer, Integer>>> adj = new ArrayList<ArrayList<Pair<Integer,Integer>>>();

        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Pair<Integer,Integer>>());
        }

        adj.get(1).add(new Pair<Integer,Integer>(1, 5));
        adj.get(1).add(new Pair<Integer,Integer>(2, 10));

        System.out.println(adj);
    }
}
