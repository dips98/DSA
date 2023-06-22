package Encapsulation;

class Farmer{
    private int land;
    private String name;

    void setName(String name){
        // if we use same name it will treat as local varaible bydefault
        // this issue called shadowing problem 
        // it can be solved by this keyword
        this.name = name;
    }
    void show(){
        System.out.println("Land :"+land+"\n"+"Name :"+name);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Farmer f = new Farmer();
        f.setName("DOLLY");
        f.show();
    }
}
