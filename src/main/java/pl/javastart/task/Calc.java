package pl.javastart.task;

public class Calc {
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public double circleField(double number) {

        return number * number * Math.PI;
    }

    public int power(int number) {
        return number * number;
    }
}