/**
 *	执行用时 : 47 ms, 在Longest Palindromic Substring的Java提交中击败了55.76% 的用户
 *	内存消耗 : 53.8 MB, 在Longest Palindromic Substring的Java提交中击败了18.20% 的用户
 */

package main;

class Solution {
	int resOffsetOdd = 0,resOffsetEven = 0,resIndex = 0,resIndexL = 0,resIndexR = 0;
	boolean editFlag = false;		//EvenNumberType String's resIndexL and resOffsetEven might be zero,use editFlag
    public String longestPalindrome(String s) {
        String result = "";
        char[] chrStr = s.toCharArray();
        
        //OddNumberType String
        for(int i = 0;i < chrStr.length;i++) {
        	OddNumberType(chrStr, i, 0);
        }
        
        //EvenNumberType String
        for(int i = 0;i < chrStr.length;i++) {
         	EvenNumberType(chrStr, i, 0);
        }
        
        //System.out.println(resIndex + " " + resOffsetOdd + " " + resIndexL + " " + resOffsetEven);
        if(resOffsetOdd >= (resOffsetEven + 1)) {
        	 for(int i = resIndex - resOffsetOdd;i <= resIndex + resOffsetOdd;i++) {
             	result += chrStr[i];
             }
        } else if (editFlag) {
        	 for(int i = resIndexL - resOffsetEven;i <= resIndexR + resOffsetEven;i++) {
              	result += chrStr[i];
             }
        } else {
        	result = (s.equals("")) ? "" : chrStr[0] + "";
        }
        
        resOffsetOdd = 0;resOffsetEven = 0;resIndex = 0;resIndexL = 0;resIndexR = 0;editFlag = false;
        //System.out.println(result);
        return result;
    }
    
    private void OddNumberType(char[] chr,int index,int offset) {
    	if(!((index - offset < 0) || (index + offset >= chr.length))) {
    		if(chr[index - offset] == chr[index + offset]) {
    			if(offset > resOffsetOdd) {
    				resOffsetOdd = offset;
    				resIndex = index;
    			}
    			OddNumberType(chr,index,offset+1);
    		}
    	}
    }
    
    private void EvenNumberType(char[] chr,int index,int offset) {
    	int leftIndex = index,rightIndex = leftIndex + 1;
    	if(!((leftIndex - offset < 0) || (rightIndex + offset >= chr.length))) {
    		if(chr[leftIndex - offset] == chr[rightIndex + offset]) {
    			if(offset >= resOffsetEven) {
    				resOffsetEven = offset;
    				resIndexL = leftIndex;
    				resIndexR = rightIndex;
    				editFlag = true;
    			}
    			EvenNumberType(chr,index,offset+1);
    		}
    	}
    }
}