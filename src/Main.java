public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int amount = 0;
        int refill = 700;
        int bonus = 0;
        if (refill > 500) {
            bonus = (refill) / 100;
        }
        int total = amount + refill + bonus;

        System.out.println("Бонусы- " + bonus);
        System.out.println("Итоговая сумма- " +total);



    }
}