package easy._201_400._225_implement_stack_using_queues;

//Implement the following operations of a stack using queues.
//
//
// push(x) -- Push element x onto stack.
// pop() -- Removes the element on top of the stack.
// top() -- Get the top element.
// empty() -- Return whether the stack is empty.
//
//
// Example:
//
//
//MyStack stack = new MyStack();
//
//stack.push(1);
//stack.push(2);
//stack.top();   // returns 2
//stack.pop();   // returns 2
//stack.empty(); // returns false
//
// Notes:
//
//
// You must use only standard operations of a queue -- which means only push to
//back, peek/pop from front, size, and is empty operations are valid.
// Depending on your language, queue may not be supported natively. You may simu
//late a queue by using a list or deque (double-ended queue), as long as you use o
//nly standard operations of a queue.
// You may assume that all operations are valid (for example, no pop or top oper
//ations will be called on an empty stack).
//
// Related Topics Stack Design


import common.ListNode;

//leetcode submit region begin(Prohibit modification and deletion)
class MyStack {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37 MB,击败了6.67% 的Java用户
//  Stack<Integer> stack;
//
//  /**
//   * Initialize your data structure here.
//   */
//  public MyStack() {
//    stack = new Stack<>();
//  }
//
//  /**
//   * Push element x onto stack.
//   */
//  public void push(int x) {
//    stack.push(x);
//  }
//
//  /**
//   * Removes the element on top of the stack and returns that element.
//   */
//  public int pop() {
//    return stack.pop();
//  }
//
//  /**
//   * Get the top element.
//   */
//  public int top() {
//    return stack.peek();
//  }
//
//  /**
//   * Returns whether the stack is empty.
//   */
//  public boolean empty() {
//    return stack.empty();
//  }


  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.9 MB,击败了6.67% 的Java用户
  ListNode stack;
  /**
   * Initialize your data structure here.
   */
  public MyStack() {
  }

  /**
   * Push element x onto stack.
   */
  public void push(int x) {
    ListNode top = new ListNode(x);
    top.next = stack;
    stack = top;
  }

  /**
   * Removes the element on top of the stack and returns that element.
   */
  public int pop() {
    int val = stack.val;
    stack = stack.next;
    return val;
  }

  /**
   * Get the top element.
   */
  public int top() {
    return stack.val;
  }

  /**
   * Returns whether the stack is empty.
   */
  public boolean empty() {
    return stack == null;
  }


}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj = new MyStack();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top(); boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

