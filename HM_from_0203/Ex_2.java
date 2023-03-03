// Вывести все простые числа от 1 до 1000
package HM_from_0203;
public class Ex_2 {
    public static void main(String[] args) {
        String set = new java.util.BitSet() {{set(1,1000+1); }}.toString();
        System.out.append(set,1,set.length()-1);
    }
}
