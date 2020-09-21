package easy._1100_1199._1103_distribute_candies_to_people;

//We distribute some number of candies, to a row of n = num_people people in the following way:
//
// We then give 1 candy to the first person, 2 candies to the second person,
// and so on until we give n candies to the last person.
//
// Then, we go back to the start of the row, giving n + 1 candies to the first person,
// n + 2 candies to the second person, and so on until we give 2 * n candies to the last person.
//
// This process repeats (with us giving one more candy each time,
// and moving to the start of the row after we reach the end) until we run out of candies.
// The last person will receive all of our remaining candies
// (not necessarily one more than the previous gift).
//
// Return an array (of length num_people and sum candies)
// that represents the final distribution of candies.
//
//
// Example 1:
//
//
//Input: candies = 7, num_people = 4
//Output: [1,2,3,1]
//Explanation:
//On the first turn, ans[0] += 1, and the array is [1,0,0,0].
//On the second turn, ans[1] += 2, and the array is [1,2,0,0].
//On the third turn, ans[2] += 3, and the array is [1,2,3,0].
//On the fourth turn, ans[3] += 1 (because there is only one candy left),
// and the final array is [1,2,3,1].
//
//
// Example 2:
//
//
//Input: candies = 10, num_people = 3
//Output: [5,2,3]
//Explanation:
//On the first turn, ans[0] += 1, and the array is [1,0,0].
//On the second turn, ans[1] += 2, and the array is [1,2,0].
//On the third turn, ans[2] += 3, and the array is [1,2,3].
//On the fourth turn, ans[0] += 4, and the final array is [5,2,3].
//
//
//
// Constraints:
//
//
// 1 <= candies <= 10^9
// 1 <= num_people <= 1000
//
// Related Topics Math
// 👍 425 👎 117


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:37.2 MB,击败了21.26% 的Java用户
  public int[] distributeCandies(int candies, int num_people) {
    /**
     *   1   2   3   ...   n    k   sum
     *   1   2   3   ...   n    0   n(n+1)/2+0nn
     *   1+n 2+n 3+n ...   n+n  1   n(n+1)/2+1nn
     *   ...
     *   1+kn 2+kn ...     n+kn k   n(n+1)/2+knn
     *
     *   S(i,n)=(i+0n)+(i+1n)+...+(i+kn)
     *         =(K+1)i+n(1+..+k)
     *         =(k+1)i+nk(k+1)/2
     */
    int n = num_people, k = -1, spanNum = n * n, firstRoundNum =
        (n * (n + 1)) / 2;//1+..+n=n*(n+1)/2

    while (0 <= candies - (firstRoundNum + (k + 1) * spanNum)) {
      candies -= firstRoundNum + (k + 1) * spanNum;
      k++;
    }
    int[] res = new int[n];

    if (k == -1) {
      int idx = 0;
      while (0 < candies) {
        if (candies < idx + 1) {
          res[idx] = candies;
        } else {
          res[idx] = idx + 1;
        }
        candies -= ++idx;
      }
      return res;
    }

    for (int i = 0; i < n; i++) {
      res[i] = (k + 1) * (i + 1) + n * k * (k + 1) / 2;
    }

    int idx = 0, tmpNum = (k + 1) * n;
    while (0 < candies) {
      if (++tmpNum < candies) {
        res[idx] += tmpNum;
      } else {
        res[idx] += candies;
        break;
      }
      idx++;
      candies -= tmpNum;
    }

    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

