import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) throws IOException {
        NoteBook laptop1 = new NoteBook("ASUS", 125, 3, "white");
        NoteBook laptop2 = new NoteBook("MAC", 150,6, "black");
        NoteBook laptop3 = new NoteBook("HUAWEI", 160, 8 , "white"); 
        NoteBook laptop4 = new NoteBook("MI", 150, 7, "black"); 
        NoteBook laptop5 = new NoteBook("PHILIPS", 135, 3 , "white");

        Stream<NoteBook> noteStream = Stream.of(laptop1, laptop2, laptop3, laptop4, laptop5);        

        HashMap<String, String> pb = new HashMap<String,String>();

        String act;
        boolean exit = false;
        while(!exit){
            System.out.println("Для фильтрации выберите: 1 - OZY, 2 - GD, 3 - Color , 4 - exit");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            act = bf.readLine();

            //фильтрация
            if(act.equals("1")){
                System.out.println("Введите размер OZY 125/135/150/160:");
                pb.put("OZY", bf.readLine());
            }
            if(act.equals("2")){
                System.out.println("Введите GD  3/6/7/8:");
                pb.put("GD", bf.readLine());;
            }
            if(act.equals("3")){
                System.out.println("Введите цвет black/white :");
                pb.put("Color", bf.readLine());
            }
            if(act.equals("4")){
                pb.putIfAbsent("OZY", "0");
                pb.putIfAbsent("GD", "0");
                if(pb.get("Color") != null) {
                    noteStream.filter(p->p.getOZY()>=Integer.parseInt(pb.get("OZY")) && p.getGD()>=Integer.parseInt(pb.get("GD")) && p.getColor().equals(pb.get("Color"))).forEach(p->System.out.println("Вам подходят ноутбук: " + p.getName()));
                } else {
                    noteStream.filter(p->p.getOZY()>=Integer.parseInt(pb.get("OZY")) && p.getGD()>=Integer.parseInt(pb.get("GD"))).forEach(p->System.out.println("Вам подходят ноутбук: " + p.getName()));
                }
                exit = true;
            }
        }

    }  
}
