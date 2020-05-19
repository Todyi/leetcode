package easy._600_699._605_can_place_flowers;

//Suppose you have a long flowerbed in which some of the plots are planted and some are not.
// However, flowers cannot be planted in adjacent plots
// - they would compete for water and both would die.
//
// Given a flowerbed
// (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty),
// and a number n, return if n new flowers can be planted in it
// without violating the no-adjacent-flowers rule.
//
// Example 1:
//
//Input: flowerbed = [1,0,0,0,1], n = 1
//Output: True
//
//
//
// Example 2:
//
//Input: flowerbed = [1,0,0,0,1], n = 2
//Output: False
//
//
//
// Note:
//
// The input array won't violate no-adjacent-flowers rule.
// The input array size is in the range of [1, 20000].
// n is a non-negative integer which won't exceed the input array size.
//
// Related Topics Array


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了93.64% 的Java用户
  //  内存消耗:49.4 MB,击败了7.14% 的Java用户
//  public boolean canPlaceFlowers(int[] flowerbed, int n) {
//    if (flowerbed[0] == 0 && ((1 < flowerbed.length && flowerbed[1] == 0)
//        || 1 == flowerbed.length)) {
//      flowerbed[0] = 1;
//      n--;
//    }
//
//    for (int i = 1; i < flowerbed.length - 1; i++) {
//      if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
//        flowerbed[i] = 1;
//        n--;
//      }
//    }
//
//    if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
//      n--;
//    }
//    return n < 1;
//  }

  //  解答成功:
  //  执行耗时:1 ms,击败了93.64% 的Java用户
  //  内存消耗:49.7 MB,击败了7.14% 的Java用户
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int i = 0;
    while (i < flowerbed.length) {
      if (flowerbed[i] == 1) {
        i += 2;
      } else if (i + 1 == flowerbed.length || flowerbed[i + 1] == 0) {
        if (n-- == 1) {
          return true;
        }
        i += 2;
      } else {
        i++;
      }
    }

    return n < 1;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

