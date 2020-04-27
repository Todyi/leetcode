package easy._201_400._202_happy_number;

//Write an algorithm to determine if a number n is "happy".
//
// A happy number is a number defined by the following process: Starting with an
//y positive integer, replace the number by the sum of the squares of its digits,
//and repeat the process until the number equals 1 (where it will stay), or it loo
//ps endlessly in a cycle which does not include 1. Those numbers for which this p
//rocess ends in 1 are happy numbers.
//
// Return True if n is a happy number, and False if not.
//
// Example:
//
//
//Input: 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//
// Related Topics Hash Table Math


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //    解答成功:
  //    执行耗时:2 ms,击败了21.59% 的Java用户
  //    内存消耗:36.3 MB,击败了6.06% 的Java用户
//    Map<Integer,Integer> existMap = new HashMap<>();
//    public boolean isHappy(int n) {
//        List<Integer> queue = new ArrayList<>();
//        int num = n;
//        while (1 <= num) {
//            Integer exist = existMap.get(num);
//            if (exist == null){
//                existMap.put(num,num);
//            }else {
//                return false;
//            }
//
//            while (0 < num) {
//                if (num % 10 != 0) {
//                    queue.add(num % 10);
//                }
//                num /= 10;
//            }
//            if (queue.size() == 1 && queue.get(0) == 1) {
//                return true;
//            }
//            if (queue.size() > 10) {
//                break;
//            }
//            num = 0;
//            for (int i = 0; i < queue.size(); i++) {
//                num += queue.get(i) * queue.get(i);
//            }
//            queue.clear();
//        }
//        return false;
//    }

  //  解答成功:
  //  执行耗时:1 ms,击败了84.24% 的Java用户
  //  内存消耗:36.1 MB,击败了6.06% 的Java用户
  public boolean isHappy(int n) {
    Map<Integer, Integer> existMap = new HashMap<>();
    while (1 < n) {
      int num = n;
      n = 0;
      Integer exist = existMap.get(num);
      if (exist == null) {
        existMap.put(num, num);
      } else {
        return false;
      }
      while (0 < num) {
        int remain = num % 10;
        if (remain != 0) {
          n += remain * remain;
        }
        num /= 10;
      }
    }

    return true;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

