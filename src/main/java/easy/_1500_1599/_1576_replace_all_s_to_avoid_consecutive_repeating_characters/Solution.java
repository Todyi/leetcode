package easy._1500_1599._1576_replace_all_s_to_avoid_consecutive_repeating_characters;

//Given a string s containing only lower case English letters and the '?' character,
// convert all the '?' characters into lower case letters
// such that the final string does not contain any consecutive repeating characters.
// You cannot modify the non '?' characters.
//
//It is guaranteed that there are no consecutive repeating characters in the given string
// except for '?'.
//
//Return the final string after all the conversions (possibly zero) have been made.
// If there is more than one solution, return any of them.
// It can be shown that an answer is always possible with the given constraints.
//
//
//
//Example 1:
//
//Input: s = "?zs"
//Output: "azs"
//Explanation: There are 25 solutions for this problem.
// From "azs" to "yzs", all are valid. Only "z" is
// an invalid modification as the string will consist of consecutive repeating characters in "zzs".

//Example 2:
//
//Input: s = "ubv?w"
//Output: "ubvaw"
//Explanation: There are 24 solutions for this problem.
// Only "v" and "w" are invalid modifications as
// the strings will consist of consecutive repeating characters in "ubvvw" and "ubvww".

//Example 3:
//
//Input: s = "j?qg??b"
//Output: "jaqgacb"

//Example 4:
//
//Input: s = "??yw?ipkj?"
//Output: "acywaipkja"
//
//
//Constraints:
//
//1 <= s.length <= 100
//s contains only lower case English letters and '?'.
//Accepted 13.2K  Submissions  27.6K

class Solution {

  //  Runtime: 1 ms, faster than 60.77% of Java online submissions for Replace All ?'s to Avoid Consecutive Repeating Characters.
  //  Memory Usage: 38.6 MB, less than 25.05% of Java online submissions for Replace All ?'s to Avoid Consecutive Repeating Characters.
  public String modifyString(String s) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == '?') {
        fill(arr, i);
      }
    }
    return String.valueOf(arr);
  }

  public void fill(char[] arr, int i) {
    char l = 0 < i ? arr[i - 1] : 'a' - 1;
    char r = i < arr.length - 1 ? arr[i + 1] : 'z' + 1;
    char tmp = 'a';
    while (tmp == l || tmp == r) {
      tmp++;
    }
    arr[i] = tmp;
  }
}
