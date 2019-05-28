/**
 * 	执行用时 : 7 ms, 在String to Integer (atoi)的Java提交中击败了96.33% 的用户
 *	内存消耗 : 35.4 MB, 在String to Integer (atoi)的Java提交中击败了90.73% 的用户
 */

class Solution {
    public int myAtoi(String str) {
        int result = 0,symbol = ' ',maxDiv10 = 214748364,record = 0;
        char[] chr = str.toCharArray();
        int len = chr.length;
        
        
        for(int i = 0;i < len;i++) {
        	char index = chr[i];
        	record = result;
        	if(symbol == ' ') {
        		if(index == '+' || index == '-') {
        			symbol = index;
        			continue;
        		} else if( index >= '0' && index <= '9') {
        			result = index - 48;
        			symbol = '+';
        			continue;
        		} else if(index == ' ') {
            		continue;
            	} else {
        			break;
        		}
        	} else {
        		if( index >= '0' && index <= '9') {
        			result = result * 10 + (index - 48);
        		} else {
        			break;
        		}
        	}
        	
        	if(record > maxDiv10) {					//溢出判断
        		if(symbol == '-' ) {
            		return Integer.MIN_VALUE;
        		}
        		return Integer.MAX_VALUE;
        	} else if(record == maxDiv10) {
        		if(symbol == '-' && index >= '8') {
            		return Integer.MIN_VALUE;
        		} else if(symbol == '+' && index >= '7') {
        			return Integer.MAX_VALUE;
        		}
        	}
        }
        
        if(symbol == '-') {
        	result = -result;
        }
        //System.out.println(result);
        return result;
    }
}