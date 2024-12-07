class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int x = 0;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                x = i;
            } else {
                if (target > nums[nums.length - 1]){
                    x = nums.length;
                } else if(target > nums[i] && target < nums[i+1]){
                    x = i + 1;
                }
            }
        }

        return x;
    }
}