package animals;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog("Male","Shiba"), new Cat("Female","Maine Coon")};
        System.out.println(animals[0].getVoice());

    }



}
