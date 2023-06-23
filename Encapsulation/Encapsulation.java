package Encapsulation;

class Farmer{
    private int land;
    private String name;

    public int getLand() {
        return land;
    }
    public String getName() {
        return name;
    }
    public void setLand(int land) {
        this.land = land;
    }
    public void setName(String name) {
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
        System.out.println(f.getName());

    }
}
