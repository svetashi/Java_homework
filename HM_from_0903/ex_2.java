import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа


public class ex_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);

        for (int i = 0; i <= 10; i++) {
            Integer rand = (int) (Math.random() * 100);
            if (rand % 2 != 0) {
                arrayList.add(rand);
                System.out.println(rand);
            }
        }
    }
}