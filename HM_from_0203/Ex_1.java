// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

package HM_from_0203;

import java.util.Scanner;



public class Ex_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        System.out.print("Введите число: ");
        int number = Integer.parseInt(iScanner.nextLine());
        System.out.printf("Вы ввели: %d \n", number);

        int count = 0;
        for (int i = 1; i <= number; i++) {
            count = number * (number + 1)/2;
        }
        System.out.printf("Треугольное число: %d \n" , count);

        int res = 1;
        for (int i = 1; i <= number; i++) {
            res = res * i;
        }
        System.out.printf("Факториал n!: %d \n", res);
        iScanner.close();
    }
}

