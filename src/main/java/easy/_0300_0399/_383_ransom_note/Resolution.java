package easy._0300_0399._383_ransom_note;

//
//Given an arbitrary ransom note string and another string containing letters from all the magazines,
//write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.
//
//
//
//Each letter in the magazine string can only be used once in your ransom note.
//
//
// Note:
//You may assume that both strings contain only lowercase letters.
//
//
//
//canConstruct("a", "b") -> false
//canConstruct("aa", "ab") -> false
//canConstruct("aa", "aab") -> true
//
// Related Topics String


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:2 ms,击败了97.63% 的Java用户
  //  内存消耗:40 MB,击败了7.69% 的Java用户
//  public boolean canConstruct(String ransomNote, String magazine) {
//    int[] map = new int[128];
//    char[] magazineArr = magazine.toCharArray();
//    char[] ransom = ransomNote.toCharArray();
//    for (char c : magazineArr) {
//      map[c]++;
//    }
//    for (char c : ransom) {
//      if (map[c] < 1) {
//        return false;
//      }
//      map[c]--;
//    }
//    return true;
//  }

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:39 MB,击败了84.62% 的Java用户
  public boolean canConstruct(String ransomNote, String magazine) {
    int[] map = new int[128];
    for (char c : ransomNote.toCharArray()) {
      int index = magazine.indexOf(c, map[c]);
      if (index == -1) {
        return false;
      }
      map[c] = index + 1;
    }
    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

