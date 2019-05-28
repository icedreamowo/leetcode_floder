/**
 * 	ִ����ʱ : 87 ms, ��ZigZag Conversion��Java�ύ�л�����20.39% ���û�
 * 	�ڴ����� : 96.3 MB, ��ZigZag Conversion��Java�ύ�л�����7.38% ���û�
 */

class Solution {
	int rows,totalRows;
	public String convert(String s, int numRows) {
		if(numRows == 1) {
			return s;
		}
		
        String result = "";
        rows = numRows;
        totalRows = 2*rows - 2;
        boolean isFromBelow = true;
        char[] chr = s.toCharArray();
        
        int index = 0;
        for(int i = 0;i < rows;i++) {
        	index = i;
        	while(index < chr.length) {
        		if((i == 0) || (i == rows - 1)) {
            		result += chr[index];
            		index += totalRows;
            	} else {
            		result += chr[index];
            		if(isFromBelow) {
                		index += totalRows - 2*i;
            		} else {
            			index += 2*i;
            		}
            		isFromBelow = !isFromBelow;
            	}
        	}
        	index = 0;
        	isFromBelow = true;
        }
        //System.out.println(result);
        return result;
    }
}