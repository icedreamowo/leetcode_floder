/**
  *	执行用时 : 47 ms , 在所有 Java 提交中击败了 19.43% 的用户 
  *内存消耗 : 38.5 MB , 在所有 Java 提交中击败了 100.00% 的用户
*/

class FooBar {
    private int n;
    private volatile boolean nowBar = false;
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(nowBar) {}
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
        	printFoo.run();
            
            nowBar = true;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            while(!nowBar) {}
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	printBar.run();
            
            nowBar = false;
        }
    }
}