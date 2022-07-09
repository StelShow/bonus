public class Main {
    public static void main(String[] args) {
        int balanceClient = 100;
        int topUp = 1100;
        int totalSum = balanceClient + topUp;
        System.out.println("Баланс после пополнения " + totalSum + " рублей");
        int bonus = topUp / 100 / 10;
        if (topUp < 1000) {
            bonus = 0;
        }
        System.out.println("Ваш бонус " + bonus);
        System.out.println("Итоговая сумма " + (totalSum + bonus) + " рублей.");
    }
}