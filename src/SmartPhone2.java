class Person2{
    String name;

    public Person2(String name) {
        this.name = name;
    }

    void buy(Phone2 p2){
        System.out.println(name +"님이 " + p2.brand +"폰을 샀습니다.");
    }
}

class Phone2{
    String brand;

    public Phone2(String brand) {
        this.brand = brand;
    }
}


public class SmartPhone2 {
    public static void main(String[] args) {
    Person2 p2 = new Person2("거니");
    Phone2 ph2 = new Phone2("사과");

    p2.buy(ph2);
    }
}
