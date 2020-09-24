package easy._1100_1199._1189_maximum_number_of_balloons;

//Given a string text, you want to use the characters of text
// to form as many instances of the word "balloon" as possible.
//
// You can use each character in text at most once.
// Return the maximum number of instances that can be formed.
//
//
// Example 1:
//
//
//
//
//Input: text = "nlaebolko"
//Output: 1
//
//
// Example 2:
//
//
//
//
//Input: text = "loonbalxballpoon"
//Output: 2
//
//
// Example 3:
//
//
//Input: text = "leetcode"
//Output: 0
//
//
//
// Constraints:
//
//
// 1 <= text.length <= 10^4
// text consists of lower case English letters only.
// Related Topics Hash Table String
// 👍 340 👎 37


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了58.05% 的Java用户
  public int maxNumberOfBalloons(String text) {
    int[] balloon = new int[26];
    char[] arr = text.toCharArray();
    for (char c : arr) {
      balloon[c - 'a']++;
    }
    int res = balloon[0];
    res = Math.min(res, balloon[1]);//'b' - 'a'
    res = Math.min(res, balloon[11] / 2);//'l' - 'a'
    res = Math.min(res, balloon[14] / 2);//'o' - 'a'
    res = Math.min(res, balloon[13]);//'n' - 'a'
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

