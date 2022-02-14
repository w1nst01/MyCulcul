package Orudzhev;

import java.util.InputMismatchException;

public class Calculate {
    public static int calculated(int number1, int number2, char operand) {
        int result = 0;
        switch (operand) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                try {
                    result = number1 / number2;
                } catch (ArithmeticException | InputMismatchException e) {
                    System.out.println("Exception : " + e);
                    System.out.println("Разрешены только целые числа от 1 до 10");

                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }
        return result;
    }
}
