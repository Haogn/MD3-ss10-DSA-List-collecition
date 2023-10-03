package ra.bt2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int)Math.floor(Math.random()*10)) ;
        }
        System.out.println("Mang ban dau "+ list);
        List<Integer> list1 = new ArrayList<>() ;
        for (int i = list.size() - 1; i >= 0  ; i--) {
            list1.add(list.get(i)) ;
        }
        System.out.println("Mang dao nguoc" + list1);
    }
}
