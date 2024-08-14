package leetcode;

public class RemoveDublicates {
    

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
         System.out.println(removeDuplicates(nums));
    }



      public static int removeDuplicates(int[] nums) {
         int total = 0;
         int index = 0;

         for (int i=1; i<nums.length; i++) {
              if (nums[i] != nums[index]) {
                    index++;
                    total++;
                    nums[index] = nums[i];
                    
              }
              
         }
         return total+1;
        
    
    }
}
