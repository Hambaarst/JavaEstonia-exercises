package animals;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("male","husky");
        System.out.println(dog.getMuzzle().getTeeth());
    }
}
