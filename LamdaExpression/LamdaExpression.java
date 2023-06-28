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
public class LamdaExpression {
    public static void main(String[] args) {
        M m = new M();
        m.show();
        
    }
}
