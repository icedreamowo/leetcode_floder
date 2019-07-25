/**
  *	执行用时 : 21 ms, 在所有 Java 提交中击败了45.95%的用户
  *	内存消耗 : 35.9 MB, 在所有 Java 提交中击败了100.00%的用户
  * 此题特殊,直接使用volatile关键字
*/

class Foo {
    volatile boolean f1 = false,f2 = false;
    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        f1 = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(!f1) {}
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        f2 = true;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while(!f2) {}
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}