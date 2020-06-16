package animals;

public class Dog extends Animal{

    private String voice = "Woof";

    public Dog() {
    }

    public Dog(String gender, String race) {
        super(gender, race);
    }

    public Dog(String name, Integer age, String gender, String race, Integer weight) {
        super(name, age, gender, race, weight);
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

    public String getVoice() {
        return voice;
    }
}
