package Orudzhev;

import Orudzhev.Calculate;
import Orudzhev.ConvertToRomanNumber;

import java.util.Scanner;

public class Reader extends ConvertToRomanNumber {

    static Scanner sc = new Scanner(System.in);
    static int numb1, numb2;
    static char operand;
    static int rezult;

    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        String userInput = sc.nextLine();
        char[] symbolChar = new char[10];

        for (int i = 0; i < userInput.length(); i++) {
            symbolChar[i] = userInput.charAt(i);
            if (symbolChar[i] == '+') {
                operand = '+';
            }
            if (symbolChar[i] == '-') {
                operand = '-';
            }
            if (symbolChar[i] == '*') {
                operand = '*';
            }
            if (symbolChar[i] == '/') {
                operand = '/';
            }
        }
        String UsSymbolChar = String.valueOf(symbolChar);
        String[] operands = UsSymbolChar.split("[+-/*]");
        String symbol01 = operands[0];
        String symbol02 = operands[1];
        String symbol03 = symbol02.trim();
        numb1 = ConvertToRomanNumber.romanToNumber(symbol01);
        numb2 = ConvertToRomanNumber.romanToNumber(symbol03);
        if (numb1 < 0 && numb2 < 0) {
            rezult = 0;
        } else {
            rezult = Calculate.calculated(numb1, numb2, operand);
            String resultRoman = ConvertToRomanNumber.convertToRomanNumber(rezult);
            System.out.println(resultRoman);

        }
        numb1 = Integer.parseInt(symbol01);
        numb2 = Integer.parseInt(symbol03);
        rezult = Calculate.calculated(numb1, numb2, operand);
        System.out.println(rezult);
        if (numb1 >10 && numb2 >10) {
            rezult = 0;
            System.out.println("Разрешены только числа от 1 до 10");
        }
    }





}
