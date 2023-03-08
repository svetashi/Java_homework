import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

public class ex_01 {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,1,4,6,7};
        boolean flag = true;
        int temp;
        String file_name = "ex_01.txt";
        File file = new File(file_name);

        try {
            FileWriter writer = new FileWriter(file);
            while(flag) {
                flag = false;
                for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i] < arr[i+1]) {
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        flag = true;
                        for (int j : arr) {
                            writer.write(Integer.toString(j));
                        }
                        writer.write("\n");
                    }
                }
            }
            writer.close();
            System.out.println(Arrays.toString(arr));
        }
        catch (Exception e) {
            System.out.println("Oops, mistake");
            System.out.println(e);
        }
    }
} 