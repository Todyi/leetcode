package easy._1_200._155_min_stack;

//Design a stack that supports push, pop, top, and retrieving the minimum elemen
//t in constant time.
//
//
// push(x) -- Push element x onto stack.
// pop() -- Removes the element on top of the stack.
// top() -- Get the top element.
// getMin() -- Retrieve the minimum element in the stack.
//
//
//
// Example 1:
//
//
//Input
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//Output
//[null,null,null,null,-3,null,0,-2]
//
//Explanation
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin(); // return -3
//minStack.pop();
//minStack.top();    // return 0
//minStack.getMin(); // return -2
//
//
//
// Constraints:
//
//
// Methods pop, top and getMin operations will always be called on non-empty sta
//cks.
//
// Related Topics Stack Design

//leetcode submit region begin(Prohibit modification and deletion)

//解答成功:
//执行耗时:4 ms,击败了89.57% 的Java用户
//内存消耗:41.5 MB,击败了10.15% 的Java用户
//class MinStack {
//
//  int min = Integer.MAX_VALUE;
//  List<Integer> stack = null;
//
//  /**
//   * initialize your data structure here.
//   */
//  public MinStack() {
//    stack = new ArrayList<>();
//  }
//
//  public void push(int x) {
//    if (x < min) {
//      min = x;
//    }
//    stack.add(x);
//  }
//
//  public void pop() {
//    int x = stack.get(stack.size() - 1);
//    stack.remove(stack.size() - 1);
//    if (x == min) {
//      min = Integer.MAX_VALUE;
//      for (Integer num : stack) {
//        if (num < min) {
//          min = num;
//        }
//      }
//    }
//  }
//
//  public int top() {
//    return stack.get(stack.size() - 1);
//  }
//
//  public int getMin() {
//    return min;
//  }
//
//}

//解答成功:
//执行耗时:3 ms,击败了100.00% 的Java用户
//内存消耗:41.1 MB,击败了17.39% 的Java用户
class MinStack {


  class Node{
    int value;
    int min;
    Node next;

    public Node(int value, int min, Node next) {
      this.value = value;
      this.min = min;
      this.next = next;
    }
  }

  Node head = null;

  /**
   * initialize your data structure here.
   */
  public MinStack() {

  }

  public void push(int x) {
    if (head == null){
      head = new Node(x,x,null);
    }else{
      head = new Node(x,Math.min(x,head.min),head);
    }
  }

  public void pop() {
    head = head.next;
  }

  public int top() {
    return head.value;
  }

  public int getMin() {
    return head.min;
  }

}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj = new MinStack();
 * obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

