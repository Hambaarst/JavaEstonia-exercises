package animals;

public class Muzzle {
    private  boolean nose=true;
    private  boolean tongue=true;
    private  Integer teeth=42;

    public Muzzle() {
    }

    public boolean isNose() {
        return nose;
    }

    public void setNose(boolean nose) {
        this.nose = nose;
    }

    public boolean isTongue() {
        return tongue;
    }

    public void setTongue(boolean tongue) {
        this.tongue = tongue;
    }

    public Integer getTeeth() {
        return teeth;
    }

    public void setTeeth(Integer teeth) {
        this.teeth = teeth;
    }
}
