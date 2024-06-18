public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.devide.apply(a, b);// Ошибка возникла в результате деления на 0.
        // Провёл соответствующее изменение в class Calculator.
        calc.println.accept(c);
    }
}
