# java-oop
### 자바 객체지향 연습하기 
### 객체지향적으로 핸드폰을 구입해보자. 

</br>

#### 실행결과
```
잡th님이 삼송폰을 샀습니다.
잡th님이 삼송폰을 켰습니다.
★★★ 폰 켜지는 중 ★★★
거니님이 사과폰을 샀습니다.
거니님이 사과폰을 켰습니다.
@@@ 폰 켜지는 중 @@@
```
</br>

1. 캡슐화
- 변수들 ("잡th", "사과", "샀", "★"...) 은 클래스로 만들어 밖에서 접근할 수 있도록 하자. 
```agsl
class Word {
    String name;
    String brand;
    String behavior;
    String emogi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBehavior() {
        return behavior;
    }

    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    public String getEmogi() {
        return emogi;
    }

    public void setEmogi(String emogi) {
        this.emogi = emogi;
    }
}
```

2. 상속성
- 반복적으로 쓰이는 것들도 하나의 클래스로 묶어 메소드를 만들어놓자.
- 또한, 부모클래스의 메소드를 확장시켜 쓸 수 있도록 자식 클래스를 상속시키자.
```agsl
class Sentence extends Word {

    void smart(Word word) {
        System.out.println(word.getName() + "님이 " + word.getBrand() + "폰을 " + word.getBehavior() + "습니다.");
    }

    void ing(Word word) {
        System.out.println(word.getEmogi() + " 폰 켜지는 중 " + word.getEmogi());
    }
}
```

3. 객체 생성
- 메인 클래스에 객체를 생성시켜, 필요한 변수들을 집어넣어 출력!!
```agsl
public class BuyingPhone {

    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        Word word = new Word();

        word.setName("잡th");
        word.setBehavior("샀");
        word.setBrand("삼송");
        sentence.smart(word);
        word.setBehavior("켰");
        sentence.smart(word);
        word.setEmogi("★★★");
        sentence.ing(word);

        word.setName("거니");
        word.setBehavior("샀");
        word.setBrand("사과");
        sentence.smart(word);
        word.setBehavior("켰");
        sentence.smart(word);
        word.setEmogi("@@@");
        sentence.ing(word);
    }
}
```