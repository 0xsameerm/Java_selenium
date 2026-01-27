package ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {

    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,2,3,5};
        findDuplicates(arr);
    }
}
