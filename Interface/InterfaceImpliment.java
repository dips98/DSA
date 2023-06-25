package Interface;

interface Coll{
    public void show();
}

interface Boll{
    public void Dikhao();
}

class Nom implements Coll,Boll{
    public void show(){
        System.out.println("In show!");
    }
    public void Dikhao(){
        System.out.println("Dikhaoo!");
    }
}

public class InterfaceImpliment {
    public static void main(String[] args) {
        System.out.println("Check");
        Nom n = new Nom();
        n.show();
        n.Dikhao();
    }
}
