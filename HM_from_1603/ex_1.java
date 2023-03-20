// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//Класс ex_1 реализует базу данный «Телефонный справочник»
//БД постоена на основе контейнера HashMap<String, ArrayList<String>>
//addPB - добавляет запись по заданным номеру телефона и фамилии
//PrintPhonebook - выводит на екран все записи БД

public class ex_1 {
    private static HashMap<String, ArrayList<String>> pb = new HashMap<String, ArrayList<String>>();

    //addPB - добавляет запись по заданным номеру телефона и фамилии
    private static void addPB(String phone, String name) {
        pb.putIfAbsent(name, new ArrayList<String>());
        pb.get(name).add(phone);
    }



    // PrintPhonebook - выводит на екран все записи БД
    public static void PrintPhonebook(){
        System.out.println("Телефонный справочник: ");
        for(Map.Entry<String,ArrayList<String>> k: pb.entrySet()){
            System.out.println(k.getKey()+": "+k.getValue());
        }
    }



    public static void main(String[] args) throws IOException {
        //переменная описывает вызываемое действие
        String act;


        //вывод на экран описания возможных действий с указанием команд
        boolean exit = false;
        while(!exit){
            System.out.println("выбор действия: 1- добавить данные, 2 - выход");

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            act = bf.readLine();

            //добавление записи
            if(act.equals("1")){
                System.out.println("Введите фамилию:");
                String name = bf.readLine();
                System.out.println("Введите телефон:");
                String phone = bf.readLine();
                addPB(phone, name);
            }
            if(act.equals("2")){
                PrintPhonebook();
                exit = true;
            }
        }
    }
}