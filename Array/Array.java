package Array;
public class Array {
    public static void main(String[] args) {
        // declaration
        int a[] = {1,3,4,5,6,7};
        String b[] = {"Hola","Bopsal","GAbndu"};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
            if(b.length>i){
                System.out.println(b[i]);
            }
        }
    }
}
