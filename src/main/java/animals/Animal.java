package animals;

public class Animal {
    private String name;
    private Integer age;
    private String gender;
    private String race;
    private Integer weight;

    public Animal() {
    }

    public Animal(String gender, String race) {
        this("default",0,"default","default",0);
        this.gender = gender;
        this.race = race;
    }

    public Animal(String name, Integer age, String gender, String race, Integer weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age>0){
            this.age = age;
        } else {
            System.out.println(this.getName()+" age cannot be less than 0");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        if (weight>0){
            this.weight = weight;
        }else {
            System.out.println(this.getName()+" cannot weight less than 0");
        }
    }
}
