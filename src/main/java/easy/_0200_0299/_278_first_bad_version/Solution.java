package easy._0200_0299._278_first_bad_version;

//You are a product manager and currently leading a team to develop a new produc
//t. Unfortunately, the latest version of your product fails the quality check. Si
//nce each version is developed based on the previous version, all the versions af
//ter a bad version are also bad.
//
// Suppose you have n versions [1, 2, ..., n] and you want to find out the first
// bad one, which causes all the following ones to be bad.
//
// You are given an API bool isBadVersion(version) which will return whether ver
//sion is bad. Implement a function to find the first bad version. You should mini
//mize the number of calls to the API.
//
// Example:
//
//
//Given n = 5, and version = 4 is the first bad version.
//
//call isBadVersion(3) -> false
//call isBadVersion(5) -> true
//call isBadVersion(4) -> true
//
//Then 4 is the first bad version. 
//
// Related Topics Binary Search

//leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

  //  解答成功:
  //  执行耗时:12 ms,击败了98.58% 的Java用户
  //  内存消耗:36.2 MB,击败了5.63% 的Java用户
  public int firstBadVersion(int n) {
    return firstBadVersion(1, n);
  }

  public int firstBadVersion(int start, int end) {
    if (end == start) {
      return start;
    }
    int mid = start + ((end - start) / 2);
    if (isBadVersion(mid)) {
      return firstBadVersion(start, mid);
    } else {
      return firstBadVersion(mid + 1, end);
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

