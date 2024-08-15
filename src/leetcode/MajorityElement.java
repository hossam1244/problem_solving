package leetcode;
 
import java.util.HashMap;
import java.util.Map;


public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,3};
        System.out.println(majorityElement(nums));
    }

   

    public static int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int majorityElement = -1;

       for (int i = 0; i < nums.length; i++) {
          if (map.containsKey(nums[i])) {
              map.put(nums[i], map.get(nums[i]) + 1);
          } else {
              map.put(nums[i], 1);
          }
       }

       // loop over map and check the hightest value
         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
              if (entry.getValue() > nums.length / 2) {
                majorityElement = entry.getKey();
              }
         }
  
       return majorityElement;
    }
}