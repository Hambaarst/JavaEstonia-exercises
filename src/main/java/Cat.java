public class Cat extends Animal{

    private String voice = "Meow";

    public Cat() {
    }

    public Cat(String gender, String race) {
        super(gender, race);
    }

    public Cat(String name, Integer age, String gender, String race, Integer weight) {
        super(name, age, gender, race, weight);
    }

}
