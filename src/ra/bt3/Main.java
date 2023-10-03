package ra.bt3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add((int) 1);
        list.add((int) 3);
        list.add((int) 6);
        list.add((int) 2);
        list.add((int) 0);
        list.add((int) 10);
        list.add((int) 9);

        System.out.println("Mang ban dau" + list);
        // cach 1 : su dung lop nac danh
//        list.sort(new Comparator<Integer>() {
//           @Override
//           public int compare(Integer o1, Integer o2) {
//               return o2.compareTo(o1);
//           }
//        });
//        System.out.println("Mang sap xep giam dan " + list);

        // cach 2 : khoi tao 1 lop ke thua
        list.sort(new NumberComparator());
        System.out.println("Mang sap xep giam dan " + list);

    }
}
