// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

package HM_from_0203;

import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(iScanner.nextLine());
        System.out.print("Введите '+,-,*,/': ");
        String action = iScanner.nextLine();
        System.out.print("Введите второе число: ");        
        int b = Integer.parseInt(iScanner.nextLine());

        switch (action) {
            case "+":
                System.out.printf("Результат операции: %d ", a + b);
                break;

            case "-":
                System.out.printf("Результат операции: %d ", a - b);
                break;

            case "*":
                System.out.printf("Результат операции: %d ", a * b);
                break;
            case "/":
                System.out.printf("Результат операции: %d ", a / b);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        iScanner.close();
    }
}
