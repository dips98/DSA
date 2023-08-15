package MapAndGenerics;

class Student{
    private String name;
    private Integer age;
    private String address;

    void Student(String name,Integer age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Integer getAge() {
        return age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class MapMore {
    public static void main(String[] args) {
        System.out.println("Maps");
    }
}
