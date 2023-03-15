// В калькулятор добавьте возможность отменить последнюю операцию.

import java.util.LinkedList;
import java.util.Scanner;

public class ex_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = Integer.parseInt(iScanner.nextLine());
        int b = 0;

        int res = 0;
        LinkedList<Integer> results = new LinkedList<>();
        System.out.println(results);
        boolean finish = false;

        while (finish == false) {
            System.out.print("Введите '+,-,*,/': ");
            String action = iScanner.nextLine();
            switch (action) {
                case "+":
                    System.out.print("Введите второе число: ");
                    b = Integer.parseInt(iScanner.nextLine());
                    res = a + b;
                    break;
                case "-":
                    System.out.print("Введите второе число: ");
                    b = Integer.parseInt(iScanner.nextLine());
                    res = a - b;
                    break;
                case "*":
                    System.out.print("Введите второе число: ");
                    b = Integer.parseInt(iScanner.nextLine());
                    res = a * b;
                    break;
                case "/":
                    System.out.print("Введите второе число: ");
                    b = Integer.parseInt(iScanner.nextLine());
                    res = a / b;
                    break;
                case "Cancel":
                    cancel(results);
                    res = results.getLast();
                    break;
                case "=":
                    System.out.println("Финальный ответ: " + res);
                    finish = true;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
            // System.out.println(res);           //вывод промежуточных результатов
            a = res;
            results.addLast(res);
        }
        iScanner.close(); 
    }

    public static LinkedList cancel(LinkedList<Integer> results) {
        results.removeLast();
        return results;
    }

}