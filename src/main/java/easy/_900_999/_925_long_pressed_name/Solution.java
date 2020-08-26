package easy._900_999._925_long_pressed_name;

//Your friend is typing his name into a keyboard. Sometimes, when typing a character c,
// the key might get long pressed, and the character will be typed 1 or more times.
//
// You examine the typed characters of the keyboard. Return True if it is possible
// that it was your friends name, with some characters (possibly none) being long pressed.
//
//
// Example 1:
//
//
//Input: name = "alex", typed = "aaleex"
//Output: true
//Explanation: 'a' and 'e' in 'alex' were long pressed.
//
//
// Example 2:
//
//
//Input: name = "saeed", typed = "ssaaedd"
//Output: false
//Explanation: 'e' must have been pressed twice, but it wasn't in the typed outp
//ut.
//
//
// Example 3:
//
//
//Input: name = "leelee", typed = "lleeelee"
//Output: true
//
//
// Example 4:
//
//
//Input: name = "laiden", typed = "laiden"
//Output: true
//Explanation: It's not necessary to long press any character.
//
//
//
// Constraints:
//
//
// 1 <= name.length <= 1000
// 1 <= typed.length <= 1000
// The characters of name and typed are lowercase letters.
//
// Related Topics Two Pointers String
// 👍 687 👎 111


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.4 MB,击败了70.61% 的Java用户
  public boolean isLongPressedName(String name, String typed) {
    char[] nameArr = name.toCharArray();
    char[] typedArr = typed.toCharArray();
    if (nameArr[0] != typedArr[0] || nameArr[nameArr.length - 1] != typedArr[typedArr.length - 1]) {
      return false;
    }
    int nameIdx = 1, typedIdx = 1;
    while (typedIdx < typedArr.length) {
      if (typedArr[typedIdx] == nameArr[nameIdx]) {
        if (nameIdx < nameArr.length - 1) {
          nameIdx++;
        }
      } else if (typedArr[typedIdx] != typedArr[typedIdx - 1]) {
        return false;
      }
      typedIdx++;
    }

    return nameIdx == nameArr.length - 1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)
