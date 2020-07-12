public class Main {
    public static void main(String[] args) {
        Pocket wallet = new Pocket(1000);

        System.out.println(wallet.getMoney(300));

        wallet.setMoney(-10);

        wallet.setMoney(2000);

        System.out.println(wallet.getMoney());

        wallet.setMoney(5);

        System.out.println(wallet.getMoney(50));
    }
}
