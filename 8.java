/**
 * 	ִ����ʱ : 7 ms, ��String to Integer (atoi)��Java�ύ�л�����96.33% ���û�
 *	�ڴ����� : 35.4 MB, ��String to Integer (atoi)��Java�ύ�л�����90.73% ���û�
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
        	
        	if(record > maxDiv10) {					//����ж�
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