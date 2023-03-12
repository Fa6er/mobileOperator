public class Main {
    public static void main(String[] args) {


        int amount = 0;
        int refill = 700;
        int bonus = 0;
        if (refill > 1000) {
            bonus = (refill) / 100;
        }
        int total = amount + refill + bonus;

        System.out.println("Бонусы- " + bonus);
        System.out.println("Итоговая сумма- " +total);


        System.out.println("Больше никакой инициативы, честно, честно) ");



    }
}