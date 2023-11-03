package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Calc calc = new Calc();

        int number = 45;
        boolean isEven = calc.isEven(number);
        boolean isOdd = calc.isOdd(number);
        double radius = 12.78;
        double field = calc.circleField(radius);
        int power = calc.power(number);

        System.out.printf("Czy liczba %s jest parzysta? %s\n", number, isEven);
        System.out.printf("Czy liczba %s jest nieparzysta? %s\n", number, isOdd);
        System.out.printf("Pole koła o promieniu %s jest równe: %s\n", radius, field);
        System.out.printf("Liczba %s do kwadratu równa się: %s\n", number, power);
    }
}