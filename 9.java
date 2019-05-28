/**
 *	ִ����ʱ : 54 ms, ��Palindrome Number��Java�ύ�л�����72.00% ���û�
 *	�ڴ����� : 38.4 MB, ��Palindrome Number��Java�ύ�л�����85.04% ���û�
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)	return false;
        if(x == 0)	return true;
        char[] chr = (x + "").toCharArray();			//�Ż�ת��
        int len = chr.length,half = len/2;
        for(int i = 0;i < half;i++) {
        	if(chr[i] != chr[len-i-1]) {
        		return false;
        	}
        }
        
        return true;
    }
}