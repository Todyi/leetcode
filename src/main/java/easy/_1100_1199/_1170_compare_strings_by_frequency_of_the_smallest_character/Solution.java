package easy._1100_1199._1170_compare_strings_by_frequency_of_the_smallest_character;

//Let's define a function f(s) over a non-empty string s,
// which calculates the frequency of the smallest character in s.
// For example, if s = "dcce" then f(s) = 2
// because the smallest character is "c" and its frequency is 2.
//
// Now, given string arrays queries and words, return an integer array answer,
// where each answer[i] is the number of words such that f(queries[i]) < f(W),
// where W is a word in words.
//
//
// Example 1:
//
//
//Input: queries = ["cbd"], words = ["zaaaz"]
//Output: [1]
//Explanation: On the first query we have f("cbd") = 1, f("zaaaz") = 3 so f("cbd") < f("zaaaz").
//
//
// Example 2:
//
//
//Input: queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
//Output: [1,2]
//Explanation: On the first query only f("bbb") < f("aaaa"). On the second query
// both f("aaa") and f("aaaa") are both > f("cc").
//
//
//
// Constraints:
//
//
// 1 <= queries.length <= 2000
// 1 <= words.length <= 2000
// 1 <= queries[i].length, words[i].length <= 10
// queries[i][j], words[i][j] are English lowercase letters.
//
// Related Topics Array String
// 👍 263 👎 672


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:39.6 MB,击败了81.61% 的Java用户
  public int[] numSmallerByFrequency(String[] queries, String[] words) {
    int wordsLen = words.length, queriesLen = queries.length;
    int[] wordsMap = new int[11];
    for (int i = 0; i < words.length; i++) {
      wordsMap[f(words[i])]++;
    }
    for (int i = 2; i < 11; i++) {
      wordsMap[i] += wordsMap[i - 1];
    }

    int[] res = new int[queriesLen];
    for (int i = 0; i < queriesLen; i++) {
      int num = f(queries[i]);
      res[i] = wordsLen - wordsMap[num];
    }

    return res;
  }

  public int f(String word) {
    char min = 'z' + 1;
    int res = 0;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      if (c < min) {
        min = c;
        res = 1;
      } else if (c == min) {
        res++;
      }
    }
    return res;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

