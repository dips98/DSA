package String;

class ConcatinationString{
    public static void main(String[] args) {
        String s1 = new String("Dipesh");
        // if not assign to s1 after concatenation it will make new string in heap but not reffer to s1 
        // Thats why we reffered to s1 to get change in s1 
        s1 = s1.concat(" Upadhyay"); 
        System.out.println(s1);
    }
}