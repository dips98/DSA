package String;

class ConcatinationString{
    public static void main(String[] args) {
        String s1 = new String("Dipesh");
        // if not assign to s1 after concatenation it will make new string in heap but not reffer to s1 
        // Thats why we reffered to s1 to get change in s1 
        s1 = s1.concat(" Upadhyay"); 
        System.out.println(s1);

        // It will create the object in String constant pool bcz not used new keyword
        String s2 = "Dipesh";

        // s3 will be created in heap area bcz we use inbuild method concat which will acts as new key word
        // And will form in heap memmory pointing s3
        String s3 = s2.concat(" Upadhyay");

        String s4 = new String("Dipesh");

        s4 = s4.concat(" Upadhyay");

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


        // +  operator
    }
}