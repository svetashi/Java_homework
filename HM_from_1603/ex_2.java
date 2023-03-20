import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ex_2 {

    public static void main(String[] args) {
        // 4 Петра, 4 Марии,  3 Анны, 2 Ивана, 1 Светлана, 1 Кристина
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Иванов", "Иван");
        hashMap.put("Петрова", "Светлана");
        hashMap.put("Белова", "Кристина");
        hashMap.put("Петрововна", "Анна");
        hashMap.put("Мусина", "Анна");
        hashMap.put("Юрин", "Иван");
        hashMap.put("Ивановыч", "Петр");
        hashMap.put("Лыков", "Павел");
        hashMap.put("Косин", "Петр");
        hashMap.put("Чернов", "Петр");
        hashMap.put("Чернышова", "Мария");
        hashMap.put("Федорова", "Мария");
        hashMap.put("Светлова", "Мария");
        hashMap.put("Савина", "Мария");
        hashMap.put("Рыкова", "Анна");
        hashMap.put("Ежов", "Петр");

        Map<String, Long>values=hashMap.values().stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("Values Count : ");
        values.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(System.out::println);
    }
}
