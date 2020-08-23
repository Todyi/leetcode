package easy._800_899._893_groups_of_special_equivalent_strings;

//You are given an array A of strings.
//
// A move onto S consists of swapping any two even indexed characters of S,
// or any two odd indexed characters of S.
//
// Two strings S and T are special-equivalent if after any number of moves onto S, S == T.
//
// For example, S = "zzxy" and T = "xyzz" are special-equivalent
// because we may make the moves "zzxy" -> "xzzy" -> "xyzz" that swap S[0] and S[2],
// then S[1] and S[3].
//
// Now, a group of special-equivalent strings from A is a non-empty subset of A such that:
//
//
// Every pair of strings in the group are special equivalent, and;
// The group is the largest size possible (ie., there isn't a string S not in the group
// such that S is special equivalent to every string in the group)
//
//
// Return the number of groups of special-equivalent strings from A.
//
//
//
//
// Example 1:
//
//
//Input: ["abcd","cdab","cbad","xyzz","zzxy","zzyx"]
//Output: 3
//Explanation:
//One group is ["abcd", "cdab", "cbad"], since they are all pairwise special equivalent,
// and none of the other strings are all pairwise special equivalent to these.
//
//The other two groups are ["xyzz", "zzxy"] and ["zzyx"].  Note that in particular,
// "zzxy" is not special equivalent to "zzyx".
//
//
//
// Example 2:
//
//
//Input: ["abc","acb","bac","bca","cab","cba"]
//Output: 3
//
//
//
//
//
//
//
//
//
// Note:
//
//
// 1 <= A.length <= 1000
// 1 <= A[i].length <= 20
// All A[i] have the same length.
// All A[i] consist of only lowercase letters.
//
//
//
//
//
// Related Topics String
// 👍 269 👎 1104


import java.util.HashSet;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 3 ms, faster than 96.23% of Java online submissions for Groups of Special-Equivalent Strings.
  //  Memory Usage: 39.5 MB, less than 78.16% of Java online submissions for Groups of Special-Equivalent Strings.
//  public int numSpecialEquivGroups(String[] A) {
//    Set map = new HashSet();
//    for (String s : A) {
//      char[] arr = s.toCharArray();
//      int odd = 1, even = 1;
//      for (int i = 0; i < arr.length; i += 2) {
//        odd *= arr[i];
//      }
//      for (int i = 1; i < arr.length; i += 2) {
//        even *= arr[i];
//      }
//      map.add(new StringBuilder().append(odd).append(" ").append(even).toString());
//    }
//    return map.size();
//  }


  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Groups of Special-Equivalent Strings.
  //  Memory Usage: 39.1 MB, less than 95.86% of Java online submissions for Groups of Special-Equivalent Strings.
  public int numSpecialEquivGroups(String[] A) {
    int result = 0;
    Set<String> set = new HashSet<>();
    for (String s : A) {
      if (set.add(sort(s.toCharArray()))) {
        result++;
      }
    }
    return result;
  }

  public String sort(char[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 2; j < array.length; j += 2) {
        if (array[j] < array[i]) {
          char tmp = array[i];
          array[i] = array[j];
          array[j] = tmp;
        }
      }
    }
    return String.valueOf(array);
  }
}
//leetcode submit region end(Prohibit modification and deletion)
