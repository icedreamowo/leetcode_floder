import java.util.ArrayList;

/**
 *	执行用时 : 29 ms, 在Integer to Roman的Java提交中击败了58.00% 的用户
 *	内存消耗 : 40.4 MB, 在Integer to Roman的Java提交中击败了81.12% 的用户
 *	可以写一个自动输入符号并自动生成更高位group的代码  但是罗马数字最高就是M 所以直接全写出来了
*/
class Solution {
	public String intToRoman(int num) {
        String result = "";
        String[] g1 = {"M","MM","MMM"};
        String[] g2 = {"C","CC","CCC","CD","D","DC","DCC","DCCC","CM","M"};
        String[] g3 = {"X","XX","XXX","XL","L","LX","LXX","LXXX","XC","C"};
        String[] g4 = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        //规律1~3 4 5~8 9~10
        ArrayList<String[]> group = new ArrayList<String[]>();
        group.add(g4);group.add(g3);group.add(g2);group.add(g1);
        
        char[] chr = (num + "").toCharArray();
        int len = chr.length;
        for(int i = len - 1,index = 0;i >= 0;i--,index++) {
        	//System.out.println(chr[i] + " " +result);
        	if(chr[i] == '0')	continue;
        	result = group.get(index)[chr[i] - '1'] + result;
        }
        //System.out.println(result);
        return result;
    }
}