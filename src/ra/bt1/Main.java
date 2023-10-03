package ra.bt1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() ;
        for (int i = 0; i < 10; i++) {
            list.add((int)Math.floor(Math.random()*10));
        }
        System.out.println(list);

        System.out.println("so lon nhat : " + list.stream().max(Comparator.naturalOrder()).orElse(0));

    }
}
