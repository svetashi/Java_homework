import java.io.BufferedReader;
import java.io.FileReader;


// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


public class ex_02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("ex_02.txt"));
        String str;

        while((str = br.readLine()) != null) {
            StringBuilder result = new StringBuilder();
            String[] words = str.replace('\"', ' ').split(",");
            String[] last_name = words[0].split(":");
            String[] points = words[1].split(":");
            String[] lesson = words[2].split(":");
            if(!str.isEmpty()) {
                result.append("Студент");
                result.append(last_name[1]);
                result.append("получил");
                result.append(points[1]);
                result.append("по предмету");
                result.append(lesson[1]);
                System.out.println(result);
            }       
        }
        br.close();
    }
}

