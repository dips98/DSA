package Array;
public class ForAdvance {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int b[][] = {{1,3,2},{4,5,6},{7,8,9}};
        System.out.println("1 D array : ");
        for(int n:a){
            System.out.print(n+ " ");
        }

        System.out.println("\n-------------------");

        System.out.println("2 D array using advance for loop aka For each: ");
        for(int i[]:b){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
