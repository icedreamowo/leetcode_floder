/**
 *	执行用时 : 54 ms, 在Palindrome Number的Java提交中击败了72.00% 的用户
 *	内存消耗 : 38.4 MB, 在Palindrome Number的Java提交中击败了85.04% 的用户
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)	return false;
        if(x == 0)	return true;
        char[] chr = (x + "").toCharArray();			//优化转换
        int len = chr.length,half = len/2;
        for(int i = 0;i < half;i++) {
        	if(chr[i] != chr[len-i-1]) {
        		return false;
        	}
        }
        
        return true;
    }
}