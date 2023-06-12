package Array;

class Demo{
    public int Add(int[] arr) {
        int result = 0;
        for(int i:arr){
            result += i;
        }
        return result;
    }
}
public class AnonymousArray {
    public static void main(String[] args) {
        Demo obj = new Demo();
        int result = obj.Add(new int[]{1,2,3,4,5});
        System.out.println(result);
    }
}
