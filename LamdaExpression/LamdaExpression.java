package LamdaExpression;
// Inner class
// Inner class have three types 1.Member(Without static)  2.Static 3.Anomymous
// Static can only work in inner class
interface I{
    public void display();
}
class M{
    public void show(){
        System.out.println("Show");
    }
    class N implements I{
        public void display(){
            System.out.println("Display !");
        }
    }
}

class O{
    public void show(){
        System.out.println("Static Show");
    }
    static class P{
        public void display(){
            System.out.println("Static Display !");
        }
    }
}

public class LamdaExpression {
    public static void main(String[] args) {
        M m = new M();
        m.show();
        M.N n = m.new N();
        n.display();

        O o = new O();
        o.show();
        O.P i  = new O.P();
        i.display();

    }
}
