package easy._200_299._232_implement_queue_using_stacks;
//Implement the following operations of a queue using stacks.
//
//
// push(x) -- Push element x to the back of queue.
// pop() -- Removes the element from in front of queue.
// peek() -- Get the front element.
// empty() -- Return whether the queue is empty.
//
//
// Example:
//
//
//MyQueue queue = new MyQueue();
//
//queue.push(1);
//queue.push(2);
//queue.peek();  // returns 1
//queue.pop();   // returns 1
//queue.empty(); // returns false
//
// Notes:
//
//
// You must use only standard operations of a stack -- which means only push to
//top, peek/pop from top, size, and is empty operations are valid.
// Depending on your language, stack may not be supported natively. You may simu
//late a stack by using a list or deque (double-ended queue), as long as you use o
//nly standard operations of a stack.
// You may assume that all operations are valid (for example, no pop or peek ope
//rations will be called on an empty queue).
//
// Related Topics Stack Design


import java.util.Stack;

//leetcode submit region begin(Prohibit modification and deletion)
class MyQueue {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.8 MB,击败了6.25% 的Java用户
  Stack<Integer> stack;
  Stack<Integer> reStack;

  /**
   * Initialize your data structure here.
   */
  public MyQueue() {
    stack = new Stack<>();
    reStack = new Stack<>();
  }

  /**
   * Push element x to the back of queue.
   */
  public void push(int x) {
    stack.push(x);
  }

  /**
   * Removes the element from in front of queue and returns that element.
   */
  public int pop() {
    if (reStack.empty()) {
      while (!stack.empty()) {
        reStack.push(stack.pop());
      }
    }
    return reStack.pop();

  }

  /**
   * Get the front element.
   */
  public int peek() {
    if (reStack.empty()) {
      while (!stack.empty()) {
        reStack.push(stack.pop());
      }
    }
    return reStack.peek();
  }

  /**
   * Returns whether the queue is empty.
   */
  public boolean empty() {
    return reStack.empty() && stack.empty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj = new MyQueue();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.peek(); boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)
