package Encapsulation;

class Farmer{
    private int land;
    private String name;

    void setName(String name){
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
