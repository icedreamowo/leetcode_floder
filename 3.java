/**
 *	ִ����ʱ : 195 ms, ��Longest Substring Without Repeating Characters��Java�ύ�л�����14.11% ���û�
 *	�ڴ����� : 36.7 MB, ��Longest Substring Without Repeating Characters��Java�ύ�л�����96.00% ���û�
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