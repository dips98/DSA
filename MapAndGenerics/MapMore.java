package MapAndGenerics;

class Student {
    private String name;
    private Integer age;
    private String city;

    public Student(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Integer getAge() {
        return age;
    }

    public void setCity(String city) {
        this.city = city;
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
        Student s1 = new Student("Dipesh", 24, "Mumbai");
        Student s2 = new Student("Shubham", 34, "Hyderbad");
        Student s3 = new 
    }
}
