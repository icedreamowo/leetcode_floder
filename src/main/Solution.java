package main;

class Solution {
	public String longestCommonPrefix(String[] strs) {
        String result = "";
        
        int len = strs.length,index = 0;
        char[] chr = null;
        if(len == 0) {
        	return "";
        }
        
        int strLen = 0,indexLen = 0;
        for(int i = 0;i < len;i++) {
        	strLen = strs[i].length();
        	if(strs[i].length() > indexLen) {
        		index = i;
        		indexLen = strLen;
        	}
        }
        
        chr = strs[index].toCharArray();
        
        return result;
    }
}