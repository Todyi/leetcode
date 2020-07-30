package easy._700_799._788_rotated_digits;

//X is a good number if after rotating each digit individually by 180 degrees,
// we get a valid number that is different from X.
// Each digit must be rotated - we cannot choose to leave it alone.
//
// A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves;
// 2 and 5 rotate to each other (on this case they are rotated in a different direction,
// in other words 2 or 5 gets mirrored); 6 and 9 rotate to each other,
// and the rest of the numbers do not rotate to any other number and become invalid.
//
// Now given a positive number N, how many numbers X from 1 to N are good?
//
//
//Example:
//Input: 10
//Output: 4
//Explanation:
//There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
//Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
//
//
// Note:
//
//
// N will be in range [1, 10000].
//
// Related Topics String
// 👍 349 👎 1138


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 6 ms, faster than 61.14% of Java online submissions for Rotated Digits.
  //  Memory Usage: 36.2 MB, less than 52.08% of Java online submissions for Rotated Digits.
  public int rotatedDigits(int N) {
    int count = 0;
    int[] notValid = {3, 4, 7};
    int[] valid = {2, 5, 6, 9};
    for (int i = 1; i <= N; i++) {
      int tmp = i;
      boolean isValid = false;
      while (tmp != 0) {
        if (isContain(notValid, tmp % 10)) {
          isValid = false;
          break;
        } else if (isContain(valid, tmp % 10)) {
          isValid = true;
        }
        tmp /= 10;
      }
      if (isValid) {
        count++;
      }
    }
    return count;
  }

  public boolean isContain(int[] arr, int x) {
    for (int i : arr) {
      if (i == x) {
        return true;
      }
    }
    return false;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

