package MapPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToList {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Argentina",2);
        map.put("Brazil",5);
        map.put("Germany",4);

        List<String> keyList = new ArrayList<>(map.keySet());
        for(String str:keyList){
            System.out.println(str);
        }

        System.out.println("---------------------");

        List<Integer> valueLisst = new ArrayList<>(map.values());
        for(int i:valueLisst){
            System.out.println(i);
        }

    }
}
