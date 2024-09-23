package Collections.Graph;

import java.util.ArrayList;

public class Graph {
    
    public static void main(String[] args) {
        int n = 3 , m = 3;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        //  This is only for undirected graph add form both side
        // adj.get(u).add(v);
        // adj.get(v).add(u);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);

        // If its directed graph the add once form 1 to 2 only u->v
        // adj.get(u).add(v);

        System.out.println("After adding"+adj.toString());

        // printing all the edges connected

        for(int i=1; i<=n;i++){
            for (int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
