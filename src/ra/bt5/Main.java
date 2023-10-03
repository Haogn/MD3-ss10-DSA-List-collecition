package ra.bt5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String text = "Viết chương trình cho sẵn một đoạn văn hoặc một câu và tìm ra chữ ngắn nhất trong câu";
        String[] words = text.split(" ") ;
        Collections.addAll(list, words) ;
        System.out.println(list);
        String min = "ab" ;
//        System.out.println(min);

        System.out.println("chu ngan nhat trong mang ");
        for (String value : list ) {
            if ( value.length() <= min.length()) {
                System.out.println(value);
            }
        }
    }
}
