package ru.mycompany;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);

        int x = calc.abs.apply(0);
        int y = calc.multiply.apply(3, 8);
        int z = calc.pow.apply(9);
        boolean h = calc.isPositive.test(-8);

        calc.println.accept(c);
        calc.println.accept(x);
        calc.println.accept(y);
        calc.println.accept(z);
        System.out.println(h);
    }
}
