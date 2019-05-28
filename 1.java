/**
  *	执行用时 : 193 ms, 在Two Sum的Java提交中击败了5.18% 的用户
  *	内存消耗 : 37.1 MB, 在Two Sum的Java提交中击败了91.99% 的用户
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i < nums.length;i++){
            for(int j = 0;j < nums.length;j++){
                if(i != j){
                    if(nums[i] + nums[j] == target){ 
                        result[0] = j;
                        result[1] = i;
                    }
                }
            }
        }
        return result;
    }
}