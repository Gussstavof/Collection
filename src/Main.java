import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integersArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();

        Integer elements = 1000000;

        System.out.println("add element in linkedList: "+addElement(integerLinkedList, elements));
        System.out.println("add element in arrayList: "+addElement(integersArrayList, elements));

        System.out.println("----------------------------------------");

        System.out.println("remove element in linkedList: "+removeElement(integerLinkedList));
        System.out.println("remove element in arrayList: "+removeElement(integersArrayList));
    }

    private static long addElement(List<Integer> list, Integer elements){
        long ini = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long removeElement(List<Integer> list) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            list.remove(150);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }
}
