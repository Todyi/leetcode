package easy._900_999._914_x_of_a_kind_in_a_deck_of_cards;

//In a deck of cards, each card has an integer written on it.
//
// Return true if and only if you can choose X >= 2 such that it is possible to
//split the entire deck into 1 or more groups of cards, where:
//
//
// Each group has exactly X cards.
// All the cards in each group have the same integer.
//
//
//
// Example 1:
//
//
//Input: deck = [1,2,3,4,4,3,2,1]
//Output: true
//Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
//
//
// Example 2:
//
//
//Input: deck = [1,1,1,2,2,2,3,3]
//Output: false´
//Explanation: No possible partition.
//
//
// Example 3:
//
//
//Input: deck = [1]
//Output: false
//Explanation: No possible partition.
//
//
// Example 4:
//
//
//Input: deck = [1,1]
//Output: true
//Explanation: Possible partition [1,1].
//
//
// Example 5:
//
//
//Input: deck = [1,1,2,2,2,2]
//Output: true
//Explanation: Possible partition [1,1],[2,2],[2,2].
//
//
//
// Constraints:
//
//
// 1 <= deck.length <= 10^4
// 0 <= deck[i] < 10^4
//
// Related Topics Array Math
// 👍 579 👎 143


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 99.30% of Java online submissions for X of a Kind in a Deck of Cards.
  //  Memory Usage: 40.2 MB, less than 43.41% of Java online submissions for X of a Kind in a Deck of Cards.
  public boolean hasGroupsSizeX(int[] deck) {
    int[] map = new int[10001];
    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23};
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, idx = 0;
    for (int i : deck) {
      map[i]++;
      if (max < i) {
        max = i;
      }
      if (i < min) {
        min = i;
      }
    }
    for (int i = min; i <= max; i++) {
      while (idx < prime.length) {
        if (map[i] % prime[idx] == 0) {
          break;
        }
        idx++;
        i = min;
      }
    }
    return idx < prime.length;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

