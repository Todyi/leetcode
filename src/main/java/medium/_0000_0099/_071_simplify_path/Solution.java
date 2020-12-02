package medium._0000_0099._071_simplify_path;

//Given an absolute path for a file (Unix-style), simplify it. Or in other words,
// convert it to the canonical path.
//
// In a UNIX-style file system, a period '.' refers to the current directory.
// Furthermore, a double period '..' moves the directory up a level.
//
// Note that the returned canonical path must always begin with a slash '/',
// and there must be only a single slash '/' between two directory names.
// The last directory name (if it exists) must not end with a trailing '/'.
// Also, the canonical path must be the shortest string representing the absolute path.
//
//
// Example 1:
//
//
//Input: path = "/home/"
//Output: "/home"
//Explanation: Note that there is no trailing slash after the last directory name.
//
//
// Example 2:
//
//
//Input: path = "/../"
//Output: "/"
//Explanation: Going one level up from the root directory is a no-op,
// as the root level is the highest level you can go.
//
//
// Example 3:
//
//
//Input: path = "/home//foo/"
//Output: "/home/foo"
//Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
//
//
// Example 4:
//
//
//Input: path = "/a/./b/../../c/"
//Output: "/c"
//
//
//
// Constraints:
//
//
// 1 <= path.length <= 3000
// path consists of English letters, digits, period '.', slash '/' or '_'.
// path is a valid Unix path.
//
// Related Topics String Stack
// 👍 975 👎 1988


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.8 MB,击败了87.68% 的Java用户
  public String simplifyPath(String path) {
    char[] arr = path.toCharArray();
    int l = 0;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == '/') {
        if (arr[l] == '/') {
          continue;
        }
        swap(arr, ++l, i);
      } else {
        int wordLen = getLen(arr, i);
        if (2 < wordLen) {
          for (int j = 0; j < wordLen; j++) {
            swap(arr, ++l, i++);
          }
          i--;
        } else if (2 == wordLen) {
          if (arr[i] == '.' && arr[i + 1] == '.') {
            l = findLastSlash(arr, l);
          } else {
            swap(arr, ++l, i++);
            swap(arr, ++l, i);
          }
        } else if (arr[i] != '.') {
          swap(arr, ++l, i);
        }
      }
    }
    if (arr[l] != '/') {
      l++;
    }
    return new String(arr, 0, l == 0 ? 1 : l);
  }

  public int findLastSlash(char[] arr, int l) {
    if (l == 0) {
      return 0;
    }
    for (int i = l - 1; i >= 0; i--) {
      if (arr[i] == '/') {
        return i;
      }
    }
    return 0;
  }

  public int getLen(char[] arr, int l) {
    int count = 1;
    for (int i = l + 1; i < arr.length; i++) {
      if (arr[i] == '/') {
        return count;
      } else {
        count++;
      }
    }
    return count;
  }

  public void swap(char[] arr, int i, int j) {
    if (i == j) {
      return;
    }
    char tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

