/**
 *	执行用时 : 195 ms, 在Longest Substring Without Repeating Characters的Java提交中击败了14.11% 的用户
 *	内存消耗 : 36.7 MB, 在Longest Substring Without Repeating Characters的Java提交中击败了96.00% 的用户
 */

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        char[] chr = s.toCharArray();
        ArrayList<Character> list = null;
        for(int i = 0;i < chr.length;i++) {
    		int sum = 0;
        	list = new ArrayList<Character>();
        	for(int j = i;j < chr.length;j++) {
            	if(list.contains(chr[j])) {				//ArrayList.contains(Object o);
            		break;
            	} else {
            		list.add(chr[j]);
            		sum++;
            	}
        	}
        	result = (sum > result) ? sum : result;
        }
        return result;
    }
}   