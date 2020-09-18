package easy._1000_1099._1089_duplicate_zeros;

//Given a fixed length array arr of integers, duplicate each occurrence of zero,
// shifting the remaining elements to the right.
//
// Note that elements beyond the length of the original array are not written.
//
// Do the above modifications to the input array in place, do not return anything from your function.
//
//
//
// Example 1:
//
//
//Input: [1,0,2,3,0,4,5,0]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
//
//
// Example 2:
//
//
//Input: [1,2,3]
//Output: null
//Explanation: After calling your function, the input array is modified to: [1,2
//,3]
//
//
//
//
// Note:
//
//
// 1 <= arr.length <= 10000
// 0 <= arr[i] <= 9
// Related Topics Array
// 👍 586 👎 229


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了94.13% 的Java用户
  //  内存消耗:40.2 MB,击败了33.59% 的Java用户
  class Node {

    int i;
    Node next;

    public Node(int i) {
      this.i = i;
    }
  }

  public void duplicateZeros(int[] arr) {
    Node header = null;
    Node tail = null;
    for (int i = 0; i < arr.length; i++) {
      if (header != null) {
        tail.next = new Node(arr[i]);
        tail = tail.next;
        if (arr[i] == 0) {
          tail.next = new Node(0);
          tail = tail.next;
        }
        arr[i] = header.i;
        header = header.next;
      } else if (arr[i] == 0) {
        header = new Node(0);
        tail = header;
      }
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

