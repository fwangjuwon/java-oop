class Person{
 String name;
    public Person(String name) {
        this.name = name;
    }

    void buy(){
        Phone phone = new Phone("삼송");
        System.out.println(name +"님이 "+phone.brand+  "폰을 샀습니다.");
    }
}
class Phone{
    String brand;

    public Phone(String brand) {
        this.brand = brand;
    }
}

public class SmartPhone {

    public static void main(String[] args) {
        Person jobth = new Person("잢th");
    jobth.buy();
    }
}
