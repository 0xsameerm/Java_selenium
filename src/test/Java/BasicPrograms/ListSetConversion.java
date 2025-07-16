package BasicPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetConversion {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);

        //List to set
        Set<Integer> set = new HashSet<>(list);

        Set<String> set2 = new HashSet<>();
        set2.add("Messi");
        set2.add("Stokes");

        //Set to List
        List<String> list2 = new ArrayList<>(set2);

        System.out.println(set);
        System.out.println(list2);
    }
}
