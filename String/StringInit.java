package String;

public class StringInit {
    public static void main(String[] args) {
        String name = "Dipesh";
        String naam = "Dipesh";

        String name1 = new String("Dipesh");
        String name2 = new String("Dipesh");

        if(naam==name){
            System.out.println("Same in the heap string constant pool");
        }
        if(name1==name2){
            System.out.println("Cant be the same bcz duplicate is allowed");
        }else{
            System.out.println("No new keyword object will come in heap memeory where duplication is allowed !");
        }
    }
}
