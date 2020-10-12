package easy._0200_0299._225_implement_stack_using_queues;

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
  //  内存消耗:37.1 MB,击败了6.67% 的Java用户
  class Queue {

    private ListNode header;
    private ListNode tail;
    private int size = 0;

    public Queue() {
    }

    public void push(int x) {
      ListNode newTail = new ListNode(x);
      size++;
      if (header == null) {
        header = newTail;
        tail = newTail;
      } else {
        tail.next = newTail;
        tail = newTail;
      }
    }

    public int pop() {
      int val = header.val;
      header = header.next;
      size--;
      return val;
    }

    public int peek() {
      return header.val;
    }

    public int size() {
      return size;
    }

    public boolean isEmpty() {
      return header == null;
    }
  }

  Queue queue;
  Integer top;

  /**
   * Initialize your data structure here.
   */
  public MyStack() {
    queue = new Queue();
  }

  /**
   * Push element x onto stack.
   */
  public void push(int x) {
    queue.push(x);
    top = x;
  }

  /**
   * Removes the element on top of the stack and returns that element.
   */
  public int pop() {
    for (int i = 0; i < queue.size(); i++) {
      top = queue.pop();
      queue.push(top);
    }
    return queue.pop();
  }

  /**
   * Get the top element.
   */
  public int top() {
    return top;
  }

  /**
   * Returns whether the stack is empty.
   */
  public boolean empty() {
    return queue.isEmpty();
  }

}

/**
 * Your MyStack object will be instantiated and called as such: MyStack obj = new MyStack();
 * obj.push(x); int param_2 = obj.pop(); int param_3 = obj.top(); boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)

