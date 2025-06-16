//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1 ");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(" " + i);
        }
        System.out.println(" Задача 2");

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(" " + i);
        }
        System.out.println(" Задача 3");

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(" " + i);
        }
        System.out.println(" Задача 4");

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(" " + i);
        }
        System.out.println(" Задача 5");

        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным.");
        }
        System.out.println(" Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i + " ");
        }
        System.out.println(" Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i + " ");
        }
        System.out.println(" Задача 8");
        int salary = 29000;
        int sum = 0;

        for (int month = 1; month <= 12; month = month + 1) {
            sum = salary + sum;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей ");
        }
        System.out.println(" Задача 9");
        sum = 0;
        double percent = 1D / 100;
        for (int month = 1; month <= 12; month = month + 1) {
            sum = salary + sum;
            sum = (int) (sum * (1 + percent));
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей ");
        }
        System.out.println(" Задача 10");
        for (int multiplier = 1; multiplier <= 10; multiplier = multiplier + 1) {
            System.out.printf("%d x %d = %d%n", 2, multiplier, 2 * multiplier);
        }
    }
}





