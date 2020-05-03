package easy._100_199._125_valid_palindrome;

//Given a string, determine if it is a palindrome, considering only alphanumeric
// characters and ignoring cases.
//
// Note: For the purpose of this problem, we define empty string as valid palind
//rome.
//
// Example 1:
//
//
//Input: "A man, a plan, a canal: Panama"
//Output: true
//
//
// Example 2:
//
//
//Input: "race a car"
//Output: false
//
// Related Topics Two Pointers String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了97.40% 的Java用户
  //  内存消耗:39.5 MB,击败了23.21% 的Java用户
//  public boolean isPalindrome(String s) {
//    if (s.isEmpty()) {
//      return true;
//    }
//    s = s.toLowerCase();
//    char[] sequence = s.toCharArray();
//    int pre = 0;
//    int sub = sequence.length - 1;
//    while (pre < sub) {
//      if (isNotNumOrChar(sequence[pre])) {
//        pre++;
//        continue;
//      }
//      if (isNotNumOrChar(sequence[sub])) {
//        sub--;
//        continue;
//      }
//      if (sequence[pre] != sequence[sub]) {
//        return false;
//      }
//      pre++;
//      sub--;
//    }
//
//    return true;
//  }
//
//  public boolean isNotNumOrChar(char o) {
//    if (('0' <= o && o <= '9') || ('a' <= o && o <= 'z')) {
//      return false;
//    }
//    return true;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.6 MB,击败了22.32% 的Java用户
  public boolean isPalindrome(String s) {
    int l = 0;
    int r = s.length() - 1;
    while (l < r) {
      int left = s.charAt(l);
      int right = s.charAt(r);
      if (97 <= left && left <= 122) {
        left -= 32;
      } else if (!((47 < left && left < 58) || (64 < left && left < 91))) {
        l++;
        continue;
      }

      if (97 <= right && right <= 122) {
        right -= 32;
      } else if (!((47 < right && right < 58) || (64 < right && right < 91))) {
        r--;
        continue;
      }

      if (left != right) {
        return false;
      }
      l++;
      r--;
    }
    return true;
  }

  public static void main(String[] args) {
    char zero = '0';
    char nine = '9';
    char A = 'A';
    char Z = 'Z';
    char a = 'a';
    char z = 'z';
    System.out.println(Integer.valueOf(zero) + ":" + Integer.valueOf(nine));
    System.out.println(Integer.valueOf(A) + ":" + Integer.valueOf(Z));
    System.out.println(Integer.valueOf(a) + ":" + Integer.valueOf(z));
  }
}
//leetcode submit region end(Prohibit modification and deletion)

