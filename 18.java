/**
 *	执行用时 : 643 ms, 在4Sum的Java提交中击败了5.02% 的用户
 *	内存消耗 : 45.8 MB, 在4Sum的Java提交中击败了51.51% 的用户
 *	暴力且繁琐的解法 可优化
 */

class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> results = new ArrayList<List<Integer>>();
		List<Integer> result = null;
		List<Integer> listHash = new ArrayList<Integer>();
		int len = nums.length,ni,nj,nk,nl;
		if(len < 4) {
			return results;
		}
		
		for(int i = 0;i < len;i++) {
			if(i + 1 < len) {
				ni = nums[i];
				for(int j = i + 1;j < len;j++) {
					if(j + 1 < len) {
						nj = nums[j];
						for(int k = j + 1;k < len;k++) {
							if(k + 1 < len) {
								nk = nums[k];
								for(int l = k + 1;l < len;l++) {
									nl = nums[l];
									if(ni + nj + nk + nl == target) {
											result = new ArrayList<Integer>();
											result.add(ni);
											result.add(nj);
											result.add(nk);
											result.add(nl);
											Collections.sort(result);
											if(!listHash.contains(result.hashCode())) {
												results.add(result);
												listHash.add(result.hashCode());
											}
											result = null;
									}
								}
							}
						}
					}
				}
			}
		}
		
		return results;
    }
}