package leetcode;

public class RotateArray {
   public static void main(String[] args) {
         int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
         int k = 3;
         rotate(nums, k);
         for (int i : nums) {
              System.out.println(i);
         }
   }


    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        RotateArray ra = new RotateArray();
        ra.reverse(nums, 0, nums.length - 1);
        ra.reverse(nums, 0, k - 1);
        ra.reverse(nums, k, nums.length - 1);     
    }


    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}