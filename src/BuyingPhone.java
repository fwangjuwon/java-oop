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

class Sentence extends Word {

    void smart(Word word) {
        System.out.println(word.getName() + "님이 " + word.getBrand() + "폰을 " + word.getBehavior() + "습니다.");
    }

    void ing(Word word) {
        System.out.println(word.getEmogi() + " 폰 켜지는 중 " + word.getEmogi());
    }
}

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
