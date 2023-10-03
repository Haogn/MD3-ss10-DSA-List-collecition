package ra.mylist;

public class MyListTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add(0, "Hoang") ;
//        System.out.println(list);
//        list.remove(100);

        MyList<String > listString = new MyList<>(2) ;
        listString.add(0, "Hung") ;
        listString.add(1, "Nam") ;
        listString.add(1, "Duc") ;
        listString.add(2, "Vinh") ;
        listString.add(2,"Hoang") ;
        listString.remove(2);
        System.out.println(listString.contains("Vinh"));
        System.out.println(listString);
    }
}
