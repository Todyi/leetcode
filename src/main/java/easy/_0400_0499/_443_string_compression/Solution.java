package easy._0400_0499._443_string_compression;

//Given an array of characters, compress it in-place.
//
// The length after compression must always be smaller than or equal to the original array.
//
// Every element of the array should be a character (not int) of length 1.
//
// After you are done modifying the input array in-place, return the new length of the array.
//
//
// Follow up:
//Could you solve it using only O(1) extra space?
//
//
// Example 1:
//
//
//Input:
//["a","a","b","b","c","c","c"]
//
//Output:
//Return 6, and the first 6 characters of the input array should be: ["a","2","b
//","2","c","3"]
//
//Explanation:
//"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
//
//
//
//
//
// Example 2:
//
//
//Input:
//["a"]
//
//Output:
//Return 1, and the first 1 characters of the input array should be: ["a"]
//
//Explanation:
//Nothing is replaced.
//
//
//
//
// Example 3:
//
//
//Input:
//["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//
//Output:
//Return 4, and the first 4 characters of the input array should be: ["a","b","1
//","2"].
//
//Explanation:
//Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb"
//is replaced by "b12".
//Notice each digit has it's own entry in the array.
//
//
//
//
// Note:
//
//
// All characters have an ASCII value in [35, 126].
// 1 <= len(chars) <= 1000.
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了92.95% 的Java用户
  //  内存消耗:39.3 MB,击败了6.82% 的Java用户
  public int compress(char[] chars) {
    if (chars.length == 1) {
      return 1;
    }
    int pointer = 0;
    int sum = 1;
    for (int i = 1; i < chars.length; i++) {
      if (chars[i - 1] != chars[i]) {
        chars[pointer++] = chars[i - 1];
        if (1 < sum) {
          char[] num = Integer.toString(sum).toCharArray();
          for (char c : num) {
            chars[pointer++] = c;
          }
        }
        sum = 1;
      } else {
        sum++;
      }
    }
    chars[pointer++] = chars[chars.length - 1];
    if (1 < sum) {
      char[] num = Integer.toString(sum).toCharArray();
      for (char c : num) {
        chars[pointer++] = c;
      }
    }

    return pointer;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

