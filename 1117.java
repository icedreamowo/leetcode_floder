/*
 *	执行用时 :16 ms, 在所有 java 提交中击败了94.77%的用户
 *	内存消耗 :36.9 MB, 在所有 java 提交中击败了100.00%的用户
 * */

package main;

class Solution {
	class H2O {
		volatile int hnum = 0;
		volatile int onum = 0;
		Object obj = null;
		
	    public H2O() {
	        obj = new Object();
	    }

	    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
	    	while(hnum/2 > onum) {
	    		Thread.yield();
	    	}
	    	
		    // releaseHydrogen.run() outputs "H". Do not change or remove this line.
		    releaseHydrogen.run();
		    
			hnum++;
	    }

	    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
	    	while(onum > hnum/2) {
	    		Thread.yield();
	    	}
	    	
	        // releaseOxygen.run() outputs "O". Do not change or remove this line.
			releaseOxygen.run();
			
	        onum++;
	    }
	}
}