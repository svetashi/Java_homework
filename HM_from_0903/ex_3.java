import java.util.ArrayList;
import java.util.Comparator;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

public class ex_3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(9);
        
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            Integer rand = (int) (Math.random() * 100);
            arrayList.add(rand);
            count = count + rand;
        }
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("Задан массив: " + arrayList);
        System.out.println("Минимальное число: " + arrayList.get(0));
        System.out.println("Максимальное число: " + arrayList.get(arrayList.size()-1));
        System.out.println("Среднее арифметическое: " + count/arrayList.size());
    }
}