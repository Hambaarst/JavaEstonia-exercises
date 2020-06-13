public class Dog {
    private String name;
    private Integer age;
    private String gender;
    private String race;
    private Integer weight;

    public Dog(String name, Integer age, String gender, String race, Integer weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String gender, String race) {
        this("default",0,"default","default",0);
        this.gender = gender;
        this.race = race;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age>0){
            this.age = age;
        } else {
            System.out.println("Dog age cannot be less than 0");
        }
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight>0){
            this.weight = weight;
        }else {
            System.out.println("Dog cannot weight less than 0");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
