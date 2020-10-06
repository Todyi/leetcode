package easy._1400_1499._1491_average_salary_excluding_the_minimum_and_maximum_salary;

//Given an array of unique integers salary where salary[i] is the salary of the employee i.
//
// Return the average salary of employees excluding the minimum and maximum salary.
//
//
// Example 1:
//
//
//Input: salary = [4000,3000,1000,2000]
//Output: 2500.00000
//Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
//
//Average salary excluding minimum and maximum salary is (2000+3000)/2= 2500
//
//
// Example 2:
//
//
//Input: salary = [1000,2000,3000]
//Output: 2000.00000
//Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
//
//Average salary excluding minimum and maximum salary is (2000)/1= 2000
//
//
// Example 3:
//
//
//Input: salary = [6000,5000,4000,3000,2000,1000]
//Output: 3500.00000
//
//
// Example 4:
//
//
//Input: salary = [8000,9000,2000,3000,6000,1000]
//Output: 4750.00000
//
//
//
// Constraints:
//
//
// 3 <= salary.length <= 100
// 10^3 <= salary[i] <= 10^6
// salary[i] is unique.
// Answers within 10^-5 of the actual value will be accepted as correct.
// Related Topics Array Sort
// 👍 146 👎 37


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.6 MB,击败了98.31% 的Java用户
  public double average(int[] salary) {
    int len = salary.length, sum = 0, min = Integer.MAX_VALUE, max = 999;
    for (int i : salary) {
      if (i < min) {
        min = i;
      }
      if (max < i) {
        max = i;
      }
      sum += i;
    }

    return (double) (sum - min - max) / (double) (len - 2);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

