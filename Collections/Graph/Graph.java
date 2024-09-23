package Collections.Graph;

import java.util.ArrayList;

public class Graph {
    
    public static void main(String[] args) {
        int n = 3 , m = 3;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }
        System.out.println("Helo"+adj.toString());
    }
}
