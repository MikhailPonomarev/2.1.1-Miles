public class Main {
    public static void main(String[] args) {

        int ticketPrice = 2500; //стоимость билета в руб.
        int roublesPerMile = 20; //бонусных за рублей за 1 милю
        int amountBonus = ticketPrice / roublesPerMile; //начислено бонусных миль

        System.out.println("Всего начислено бонусных миль за покупку билета: " + amountBonus);

    }
}
