import javax.annotation.processing.SupportedSourceVersion;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0;
        int r=people.length;
        int count =0;
        while(l < r) {
            if (people[r] + people[l] <= limit) {
                count++;
                r--;
                l++;
            } else {
                count++;
                r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.stream(threeSum(nums1, 9)).boxed().toList());
//        rotate(nums1, 2);
//        rotate(nums1, 3);
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(6);
        a.add(5);
        a.add(2);
        a.add(9);
        a.add(10);
        Collections.sort(a);
//        System.out.println(Arrays.stream(nums1).boxed().toList());
        System.out.println(a);
    }
}