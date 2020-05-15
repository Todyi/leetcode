package easy._500_599._541_reverse_string_ii;

//
//Given a string and an integer k,
// you need to reverse the first k characters
// for every 2k characters counting from the start of the string.
// If there are less than k characters left, reverse all of them.
// If there are less than 2k but greater than or equal to k characters,
// then reverse the first k characters and left the other as original.
//
//
// Example:
//
//Input: s = "abcdefg", k = 2
//Output: "bacdfeg"
//
//
//
//Restrictions:
//
// The string consists of lower English letters only.
// Length of the given string and k will in the range [1, 10000]
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39.9 MB,击败了7.41% 的Java用户
  public String reverseStr(String s, int k) {
    if (k < 2) {
      return s;
    }
    char[] arr = s.toCharArray();
    int i = 0;
    while (i < arr.length) {
      reverse(arr,i,arr.length < i + k ? arr.length - 1 : i + k - 1);
      i += 2 * k;
    }
    return new String(arr);
  }

  public void reverse(char[] arr,int start,int end){
    while (start < end) {
      char tmp = arr[start];
      arr[start++] = arr[end];
      arr[end--] = tmp;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

