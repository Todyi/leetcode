package easy._0600_0699._682_baseball_game;

//
//You're now a baseball game point recorder.
//
//
//
//Given a list of strings, each string can be one of the 4 following types:
//
// Integer (one round's score):
// Directly represents the number of points you get in this round.

// "+" (one round's score):
// Represents that the points you get in this round are the sum of the last two valid round's points.

// "D" (one round's score):
// Represents that the points you get in this round are the doubled data of the last valid round's points.

// "C" (an operation, which isn't a round's score):
// Represents the last valid round's points you get were invalid and should be removed.
//
//
//
//
//Each round's operation is permanent and could have an impact on the round befo
//re and the round after.
//
//
//
//You need to return the sum of the points you could get in all the rounds.
//
//
// Example 1:
//
//Input: ["5","2","C","D","+"]
//Output: 30
//Explanation:
//Round 1: You could get 5 points. The sum is: 5.
//Round 2: You could get 2 points. The sum is: 7.
//Operation 1: The round 2's data was invalid. The sum is: 5.
//Round 3: You could get 10 points (the round 2's data has been removed). The sum is: 15.
//Round 4: You could get 5 + 10 = 15 points. The sum is: 30.
//
//
//
// Example 2:
//
//Input: ["5","-2","4","C","D","9","+","+"]
//Output: 27
//Explanation:
//Round 1: You could get 5 points. The sum is: 5.
//Round 2: You could get -2 points. The sum is: 3.
//Round 3: You could get 4 points. The sum is: 7.
//Operation 1: The round 3's data is invalid. The sum is: 3.
//Round 4: You could get -4 points (the round 3's data has been removed). The sum is: -1.
//Round 5: You could get 9 points. The sum is: 8.
//Round 6: You could get -4 + 9 = 5 points. The sum is 13.
//Round 7: You could get 9 + 5 = 14 points. The sum is 27.
//
//
//
// Note:
// The size of the input list will be between 1 and 1000.
// Every integer represented in the list will be between -30000 and 30000.
// Related Topics Stack


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了99.67% 的Java用户
  //  内存消耗:37.5 MB,击败了7.69% 的Java用户
  public int calPoints(String[] ops) {
    int[] points = new int[ops.length];
    int sum = 0, flag = -1;
    for (String op : ops) {
      if (op.equals("+")) {
        flag++;
        points[flag] = points[flag - 1] + points[flag - 2];
        sum += points[flag];
      } else if (op.equals("D")) {
        flag++;
        points[flag] = points[flag - 1] * 2;
        sum += points[flag];
      } else if (op.equals("C")) {
        sum -= points[flag--];
      } else {
        flag++;
        points[flag] = Integer.parseInt(op);
        sum += points[flag];
      }
    }
    return sum;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

