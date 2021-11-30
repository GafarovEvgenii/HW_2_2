public class Main {
    public static void main(String[] args) {

        int deposit = 100;
        int transfer = 1000;

        int total = deposit + transfer;

        int bonus;
        if (transfer >= 1000) {
            bonus = transfer / 100;
        } else {
            bonus = 0;
        }

        System.out.println(" Сумма на счету: " + total);
        System.out.println(" Бонусные рубли: " + bonus);
    }
}
