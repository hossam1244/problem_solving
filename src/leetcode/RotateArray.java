package leetcode;

public class RotateArray {
   public static void main(String[] args) {
         int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
         // [5,6,7,1,2,3,4]
         int k = 3;
         rotate(nums, k);
         for (int i : nums) {
              System.out.println(i);
         }
   }


    public static void rotate(int[] nums, int k) {
       int[] result = new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
              result[(i + k) % nums.length] = nums[i];
         }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = result[i];
            }
    }



}
