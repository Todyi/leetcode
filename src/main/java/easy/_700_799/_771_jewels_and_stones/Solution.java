package easy._700_799._771_jewels_and_stones;

//You're given strings J representing the types of stones that are jewels, and S
// representing the stones you have. Each character in S is a type of stone you have.
// You want to know how many of the stones you have are also jewels.
//
// The letters in J are guaranteed distinct, and all characters in J and S are letters.
// Letters are case sensitive, so "a" is considered a different type of sto
//ne from "A".
//
// Example 1:
//
//
//Input: J = "aA", S = "aAAbbbb"
//Output: 3
//
//
// Example 2:
//
//
//Input: J = "z", S = "ZZ"
//Output: 0
//
//
// Note:
//
//
// S and J will consist of letters and have length at most 50.
// The characters in J are distinct.
//
// Related Topics Hash Table
// 👍 2137 👎 368


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了77.22% 的Java用户
  //  内存消耗:39.3 MB,击败了15.00% 的Java用户
  public int numJewelsInStones(String J, String S) {
    int[] map = new int[256];
    int count = 0;
    for (char c : J.toCharArray()) {
      map[c]++;
    }
    for (char c : S.toCharArray()) {
      if (0 < map[c]) {
        count++;
      }
    }
    return count;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

