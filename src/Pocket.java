public class Pocket {
    private Integer money;

    public Pocket(Integer money) {
        this.money = money;
    }

    public Integer getMoney() {
        return money;
    }

    public Integer getMoney(Integer cash) {
        if (money <= 10){
            return 0;
        }
        return cash;
    }

    public void setMoney(Integer money) {
        if (money < 0 || money >3000) {
            System.out.println("Doesn't fit the bill.");
        } else {
            this.money = money;
        }
    }
}
