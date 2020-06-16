package animals;

public class Cat extends Animal{

    private final String voice = "Meow";

    public Cat() {
    }

    public Cat(String gender, String race) {
        super(gender, race);
        this.setVoice(voice);
    }

    public Cat(String name, Integer age, String gender, String race, Integer weight) {
        super(name, age, gender, race, weight);
        this.setVoice(voice);
    }

//    public String getVoice() {
//        return voice;
//    }
}
