class Solution {
    public int searchInsert(int[] nums, int target) {
       int left = 0;
       int right = nums.length - 1;

       while (left <= right){
        int mid = left + (right - left) / 2;
            if (nums[mid] == target){
            return mid;
            } else if (nums[mid] < target){
            left = mid + 1;
            } else {
            right = mid - 1;
            }
        }
        if (nums[nums.length - 1] < target){
            return nums.length;
        } else if (nums[0] > target){
            return 0;
        } else {
            for (int i = 1; i < nums.length; i++){
            if(nums[i-1] < target && nums[i] > target){
                return i;
            }
        }  
    }
    return -1;   
    }
}