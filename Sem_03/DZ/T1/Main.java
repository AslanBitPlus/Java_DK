package DZ.T1;

/*
Задание - 3.1
Написать класс Калькулятор (необобщенный), который содержит
обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция.
Методы должны возвращать результат своей работы.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 3.1");
        int a = 2;
        int b = 3;
        System.out.println("Integer");
        System.out.printf("a = %s, b = %s", a, b + "\n");
        System.out.printf("Sum(%s + %s) = %s", a, b, Calculator.sum(a, b) + "\n");
        System.out.printf("Subtract(%s - %s) = %s", a, b, Calculator.subtract(a, b) + "\n");
        System.out.printf("Multiply(%s * %s) = %s", a, b, Calculator.multiply(a, b) + "\n");
        System.out.printf("Divide(%s / %s) = %s", a, b, Calculator.divide(a, b) + "\n");

        System.out.println("Double");
        double c = 2.3;
        double d = 3.4;
        System.out.printf("c = %s, d = %s", c, d + "\n");
        System.out.printf("Sum(%s + %s) = %s", c, d, Calculator.sum(c, d) + "\n");
        System.out.printf("Subtract(%s - %s) = %s", c, d, Calculator.subtract(c, d) + "\n");
        System.out.printf("Multiply(%s * %s) = %s", c, d, Calculator.multiply(c, d) + "\n");
        System.out.printf("Divide(%s / %s) = %s", c, d, Calculator.divide(c, d) + "\n");

        System.out.println("Float");
        float e = 2.3f;
        float f = 3.4f;
        System.out.printf("c = %s, d = %s", e, f + "\n");
        System.out.printf("Sum(%s + %s) = %s", e, f, Calculator.sum(e, f) + "\n");
        System.out.printf("Subtract(%s - %s) = %s", e, f, Calculator.subtract(e, f) + "\n");
        System.out.printf("Multiply(%s * %s) = %s", e, f, Calculator.multiply(e, f) + "\n");
        System.out.printf("Divide(%s / %s) = %s", e, f, Calculator.divide(e, f) + "\n");

    }
}
