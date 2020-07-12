package animals;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog("Male", "Shiba"), new Cat("Female", "Maine Coon")};
        for (Animal specimen : animals) {
            specimen.yieldVoice();
            System.out.println(specimen.getClass().getSimpleName());
        }
    }
}
