package easy._1100_1199._1114_print_in_order;
//Suppose we have a class:
//
//
//public class Foo {
//  public void first() { print("first"); }
//  public void second() { print("second"); }
//  public void third() { print("third"); }
//}
//
//
// The same instance of Foo will be passed to three different threads. Thread A will call first(), thread B will call second(), and thread C will call third().
//Design a mechanism and modify the program to ensure that second() is executed af
//ter first(), and third() is executed after second().
//
//
//
// Example 1:
//
//
//Input: [1,2,3]
//Output: "firstsecondthird"
//Explanation: There are three threads being fired asynchronously. The input [1,
//2,3] means thread A calls first(), thread B calls second(), and thread C calls t
//hird(). "firstsecondthird" is the correct output.
//
//
// Example 2:
//
//
//Input: [1,3,2]
//Output: "firstsecondthird"
//Explanation: The input [1,3,2] means thread A calls first(), thread B calls th
//ird(), and thread C calls second(). "firstsecondthird" is the correct output.
//
//
//
// Note:
//
// We do not know how the threads will be scheduled in the operating system, eve
//n though the numbers in the input seems to imply the ordering. The input format
//you see is mainly to ensure our tests' comprehensiveness.
// 👍 557 👎 96

//leetcode submit region begin(Prohibit modification and deletion)
//class Foo {
//
//  //  Runtime: 9 ms, faster than 96.73% of Java online submissions for Print in Order.
//  //  Memory Usage: 38.8 MB, less than 83.20% of Java online submissions for Print in Order.
//  Semaphore lock2, lock3;
//
//  public Foo() {
//    lock2 = new Semaphore(0);
//    lock3 = new Semaphore(0);
//  }
//
//  public void first(Runnable printFirst) throws InterruptedException {
//    // printFirst.run() outputs "first". Do not change or remove this line.
//    printFirst.run();
//    lock2.release();
//  }
//
//  public void second(Runnable printSecond) throws InterruptedException {
//    // printSecond.run() outputs "second". Do not change or remove this line.
//    lock2.acquire();
//    printSecond.run();
//    lock3.release();
//  }
//
//  public void third(Runnable printThird) throws InterruptedException {
//    lock3.acquire();
//    // printThird.run() outputs "third". Do not change or remove this line.
//    printThird.run();
//  }
//}

class Foo {

  //  Runtime: 9 ms, faster than 96.73% of Java online submissions for Print in Order.
  //  Memory Usage: 39 MB, less than 64.23% of Java online submissions for Print in Order.
  volatile int lock = 0;

  public Foo() {
  }

  public void first(Runnable printFirst) throws InterruptedException {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    lock++;
  }

  public void second(Runnable printSecond) throws InterruptedException {
    // printSecond.run() outputs "second". Do not change or remove this line.
    while (lock != 1) {
    }
    printSecond.run();
    lock++;
  }

  public void third(Runnable printThird) throws InterruptedException {
    // printThird.run() outputs "third". Do not change or remove this line.
    while (lock != 2) {
    }
    printThird.run();
  }
}
//leetcode submit region end(Prohibit modification and deletion)


