import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class ex_2 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("тебя!");
        words.add("видеть");
        words.add("рад");
        words.add("Я");
        System.out.println("Лист до изменений: " + words);
        enqueue(words);
        System.out.println("Лист после  изменений: " + words);
        dequeue(words);
        System.out.println("Лист после удаления первого элемента: " + words);
        first(words);
        System.out.println("Лист без изменений и без удаления первого элемента: " + words);
    }
    public static LinkedList enqueue(LinkedList<String> words) {
        System.out.println("Помещаем элемент LAST в конец списка");
        words.addLast("LAST");
    return words;
    }
    public static LinkedList dequeue(LinkedList<String> words) {
        System.out.println("Первый элемент из листа : " + words.get(0));
        words.remove(0);
        return words;
    }
    public static LinkedList first(LinkedList<String> words) {
        System.out.println("Первый элемент из листа : " + words.get(0));
        return words;
    }
}