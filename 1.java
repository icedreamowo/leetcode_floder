/**
  *	ִ����ʱ : 193 ms, ��Two Sum��Java�ύ�л�����5.18% ���û�
  *	�ڴ����� : 37.1 MB, ��Two Sum��Java�ύ�л�����91.99% ���û�
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