public class Rectangle extends Shape {
    private Integer sideA;
    private Integer sideB;

    public Rectangle() {
    }

    public Rectangle(Integer sideA, Integer sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Integer getSideA() {
        return sideA;
    }

    public void setSideA(Integer sideA) {
        this.sideA = sideA;
    }

    public Integer getSideB() {
        return sideB;
    }

    public void setSideB(Integer sideB) {
        this.sideB = sideB;
    }

}
