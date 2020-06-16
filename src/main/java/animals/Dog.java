package animals;

public class Dog extends Animal{

    private final String voice = "Woof";
    private Muzzle muzzle;
    public Muzzle getMuzzle() {
        return muzzle;
    }

    public void setMuzzle(Muzzle muzzle) {
        this.muzzle = muzzle;
    }

    public Dog() {
        this.setVoice(voice);
        this.muzzle = new Muzzle();
    }

    public Dog(String gender, String race) {
        super(gender, race);
        this.setVoice(voice);
        this.muzzle = new Muzzle();
    }

    public Dog(String name, Integer age, String gender, String race, Integer weight) {
        super(name, age, gender, race, weight);
        this.setVoice(voice);
        this.muzzle = new Muzzle();
    }


}
