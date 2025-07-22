package MapPrograms;

import java.util.*;

public class Sort {

    public static void sortByKeys( HashMap<Integer,String> map){

        //TreeMap sorts keys by natural order
        System.out.println("SortingByKeys using TreeMap");
        Map<Integer,String> treeMap = new TreeMap<>(map);

        for(Map.Entry<Integer,String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("--------------------");

        //2.using comparator
        System.out.println("SortingByKeys using Comparator");
        List<Map.Entry<Integer,String>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByKey());

        for(Map.Entry<Integer,String> entry:entryList){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("--------------------");
    }

    public static void sortByValues(HashMap<Integer,String> map){

        //Converting map to list of entries
        System.out.println("SortingByValues using comparator");
        List<Map.Entry<Integer,String>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        for(Map.Entry<Integer,String> entry:entryList){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        System.out.println("--------------------");

        //Reverse order
        System.out.println("Reverse order");
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for(Map.Entry<Integer,String> entry:entryList){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"Sharjah");
        map.put(1,"Dubai");
        map.put(4,"Ajman");
        map.put(3,"Abu Dhabi");
        sortByKeys(map);
        sortByValues(map);
    }
}
