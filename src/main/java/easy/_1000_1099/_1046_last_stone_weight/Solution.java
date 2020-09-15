package easy._1000_1099._1046_last_stone_weight;

//We have a collection of stones, each stone has a positive integer weight.
//
// Each turn, we choose the two heaviest stones and smash them together. Suppose
// the stones have weights x and y with x <= y. The result of this smash is:
//
//
// If x == y, both stones are totally destroyed;
// If x != y, the stone of weight x is totally destroyed,
// and the stone of weight y has new weight y-x.
//
//
// At the end, there is at most 1 stone left. Return the weight of this stone
// (or 0 if there are no stones left.)
//
//
//
// Example 1:
//
//
//Input: [2,7,4,1,8,1]
//Output: 1
//Explanation:
//We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//we combine 1 and 1 to get 0 so the array converts to [1] then that's the value
// of last stone.
//
//
//
// Note:
//
//
// 1 <= stones.length <= 30
// 1 <= stones[i] <= 1000
//
// Related Topics Heap Greedy
// 👍 937 👎 31



//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.6 MB,击败了95.07% 的Java用户
  public int lastStoneWeight(int[] stones) {
    int[] weightMap = new int[1001];
    int maxWeight = 0, secWeight = 0, tmp = 0;
    for (int weight : stones) {
      weightMap[weight]++;
      if (maxWeight < weight) {
        maxWeight = weight;
      }
    }
    weightMap[maxWeight]--;
    secWeight = find(weightMap, maxWeight);

    while (0 < maxWeight && 0 < secWeight) {
      tmp = maxWeight - secWeight;
      if (0 < tmp) {
        weightMap[tmp]++;
      }
      if (weightMap[maxWeight] == 0) {
        maxWeight = find(weightMap, maxWeight - 1);
      } else {
        weightMap[maxWeight]--;
      }
      secWeight = find(weightMap, maxWeight);
    }
    return maxWeight;
  }

  public int find(int[] weightMap, int weight) {
    while (0 < weight && 0 == weightMap[weight]) {
      weight--;
    }
    if (weight == 0) {
      return 0;
    }
    weightMap[weight]--;
    return weight;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

