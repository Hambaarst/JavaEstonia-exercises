package animals;

public class Dog extends Animal{

    private final String voice = "Woof";

    public Dog() {
    }

    public Dog(String gender, String race) {
        super(gender, race);
        this.setVoice(voice);
    }

    public Dog(String name, Integer age, String gender, String race, Integer weight) {
        super(name, age, gender, race, weight);
        this.setVoice(voice);
    }

    @Override
    public String toString() {
        return "animals.Dog{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", race='" + getRace() + '\'' +
                ", weight=" + getWeight() +
                '}';
    }

}
