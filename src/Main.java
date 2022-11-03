import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> integersArrayList = new ArrayList<>();
        List<Integer> integerLinkedList = new LinkedList<>();
        Set<Integer>  integerHashSet = new HashSet<>();

        Integer elements = 50000;
        System.out.println("add element in hashSet: "+addElement(integerHashSet, elements));
        System.out.println("add element in linkedList: "+addElement(integerLinkedList, elements));
        System.out.println("add element in arrayList: "+addElement(integersArrayList, elements));

        System.out.println("----------------------------------------");

        System.out.println("search element in hashSet: "+checkElements(integerHashSet));
        System.out.println("search element in linkedList: "+checkElements(integerLinkedList));
        System.out.println("search element in arrayList: "+checkElements(integersArrayList));


        System.out.println("----------------------------------------");

        System.out.println("remove element in hashSet: "+removeElement(integerHashSet));
        System.out.println("remove element in linkedList: "+removeElement(integerLinkedList));
        System.out.println("remove element in arrayList: "+removeElement(integersArrayList));
    }

    private static long checkElements(Collection<Integer> list){
        long ini = System.currentTimeMillis();
        for (Integer element : list) {
            list.contains(element);
        }

        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long addElement(Collection<Integer> list, Integer elements){
        long ini = System.currentTimeMillis();
        for (int i = 0; i < elements; i++) {
            list.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }

    private static long removeElement(Collection<Integer> list) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            list.remove(150);
        }
        long fim = System.currentTimeMillis();
        return fim-ini;
    }
}
