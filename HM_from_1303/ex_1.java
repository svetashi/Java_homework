import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

public class ex_1 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("тебя!");
        words.add("видеть");
        words.add("рад");
        words.add("Я");
        LinkedList<String> reverse = difStrings(words);
        System.out.println(reverse);
    }
    
    public static LinkedList difStrings(LinkedList<String> words) {
        LinkedList<String> reverse = new LinkedList<>();
        for (int i = 0; i <= words.size() ; i++) {
            while(!words.isEmpty()){
                reverse.add(words.pollLast());
            }
        }
        return reverse;
    }
}