package easy._1300_1399._1370_increasing_decreasing_string;

//Given a string s. You should re-order the string using the following algorithm:
//
//
// Pick the smallest character from s and append it to the result.
// Pick the smallest character from s which is greater than
// the last appended character to the result and append it.
// Repeat step 2 until you cannot pick more characters.
// Pick the largest character from s and append it to the result.
// Pick the largest character from s which is smaller than
// the last appended character to the result and append it.
// Repeat step 5 until you cannot pick more characters.
// Repeat the steps from 1 to 6 until you pick all characters from s.
//
//
// In each step, If the smallest or the largest character appears more than once
// you can choose any occurrence and append it to the result.
//
// Return the result string after sorting s with this algorithm.
//
//
// Example 1:
//
//
//Input: s = "aaaabbbbcccc"
//Output: "abccbaabccba"
//Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
//After steps 4, 5 and 6 of the first iteration, result = "abccba"
//First iteration is done. Now s = "aabbcc" and we go back to step 1
//After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
//After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
//
//
// Example 2:
//
//
//Input: s = "rat"
//Output: "art"
//Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.
//
//
// Example 3:
//
//
//Input: s = "leetcode"
//Output: "cdelotee"
//
//
// Example 4:
//
//
//Input: s = "ggggggg"
//Output: "ggggggg"
//
//
// Example 5:
//
//
//Input: s = "spo"
//Output: "ops"
//
//
//
// Constraints:
//
//
// 1 <= s.length <= 500
// s contains only lower-case English letters.
//
// Related Topics String Sort
// 👍 223 👎 206


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:3 ms,击败了70.15% 的Java用户
  //  内存消耗:38.9 MB,击败了98.90% 的Java用户
//  public String sortString(String s) {
//    int[] map = new int[26];
//    char[] arr = s.toCharArray();
//    int pre = -1, tmp, idx = 0, len = arr.length;
//    boolean smallest = true;
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i < arr.length; i++) {
//      map[arr[i] - 'a']++;
//
//    }
//    while (idx < len) {
//      if (smallest) {
//        tmp = pickSmallest(pre, map);
//      } else {
//        tmp = pickLargest(pre, map);
//      }
//      if (tmp == -1) {
//        smallest = !smallest;
//        pre = smallest ? -1 : 27;
//      } else {
//        sb.append((char) ((pre = tmp) + 'a'));
//        idx++;
//      }
//    }
//    return sb.toString();
//  }
//
//  public int pickSmallest(int pre, int[] map) {
//    for (int i = 0; i < map.length; i++) {
//      if (pre < i && 0 < map[i]) {
//        map[i]--;
//        return i;
//      }
//    }
//    return -1;
//  }
//
//  public int pickLargest(int pre, int[] map) {
//    for (int i = map.length - 1; i >= 0; i--) {
//      if (i < pre && 0 < map[i]) {
//        map[i]--;
//        return i;
//      }
//    }
//    return -1;
//  }

  //  解答成功:
  //  执行耗时:2 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了95.49% 的Java用户
  public String sortString(String s) {
    int[] map = new int[26];
    char[] arr = s.toCharArray();
    int len = arr.length;
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      map[arr[i] - 'a']++;

    }
    while (sb.length() < len) {
      addSmallToLarge(sb, map);
      addLargeToSmall(sb, map);
    }
    return sb.toString();
  }

  public void addSmallToLarge(StringBuilder sb, int[] map) {
    for (int i = 0; i < map.length; i++) {
      if (0 < map[i]) {
        sb.append((char) (i + 'a'));
        map[i]--;
      }
    }
  }

  public void addLargeToSmall(StringBuilder sb, int[] map) {
    for (int i = map.length - 1; i >= 0; i--) {
      if (0 < map[i]) {
        sb.append((char) (i + 'a'));
        map[i]--;
      }
    }
  }

}
//leetcode submit region end(Prohibit modification and deletion)

