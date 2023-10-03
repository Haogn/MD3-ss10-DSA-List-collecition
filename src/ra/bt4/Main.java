package ra.bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String text = "Rekkei Academy de nong dan biet code" ;
        List<String> list = new ArrayList<>();

        // tach cac phan tu bang khoang trang
        String[] words = text.split(" ") ;
        System.out.println(Arrays.toString(words));

        Collections.addAll(list, words);

        System.out.println("Chuoi co do dai lon hon 3 ky tu ");
       for (String str : list ) {
           if (str.length() > 3) {
               System.out.println(str);
           }
        }
    }
}
