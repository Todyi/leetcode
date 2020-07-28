package easy._700_799._748_shortest_completing_word;

//
//Find the minimum length word from a given dictionary words,
// which has all the letters from the string licensePlate.
// Such a word is said to complete the given string licensePlate
//
//Here, for letters we ignore case.
// For example, "P" on the licensePlate still matches "p" on the word.
//
//It is guaranteed an answer exists. If there are multiple answers,
// return the one that occurs first in the array.
//
//The license plate might have the same letter occurring multiple times.
// For example, given a licensePlate of "PP", the word "pair" does not complete the licensePlate,
// but the word "supper" does.
//
//
// Example 1:
//
//Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
//Output: "steps"
//Explanation: The smallest length word that contains the letters "S", "P", "S", and "T".
//Note that the answer is not "step", because the letter "s" must occur in the word twice.
//Also note that we ignored case for the purposes of comparing whether a letter exists in the word.
//
//
//
// Example 2:
//
//Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
//Output: "pest"
//Explanation: There are 3 smallest length words that contains the letters "s".
//We return the one that occurred first.
//
//
//
// Note:
//
// licensePlate will be a string with length in range [1, 7].
// licensePlate will contain digits, spaces, or letters (uppercase or lowercase)
//.
// words will have a length in the range [10, 1000].
// Every words[i] will consist of lowercase letters, and have length in range [1
//, 15].
//
// Related Topics Hash Table
// 👍 180 👎 624


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 4 ms, faster than 75.40% of Java online submissions for Shortest Completing Word.
  //  Memory Usage: 40.1 MB, less than 27.03% of Java online submissions for Shortest Completing Word.
  public String shortestCompletingWord(String licensePlate, String[] words) {
    int[] plateMap = new int[26];
    licensePlate = licensePlate.toLowerCase();
    for (char c : licensePlate.toCharArray()) {
      if ('a' <= c && c <= 'z') {
        plateMap[c - 'a']++;
      }
    }
    String theWord = null;
    int minWordLen = Integer.MAX_VALUE;
    for (int i = 0; i < words.length; i++) {
      String word = words[i].toLowerCase();
      int[] wordMap = new int[26];
      for (char c : word.toCharArray()) {
        wordMap[c - 'a']++;
      }
      if (isContains(plateMap, wordMap)) {
        if (words[i].length() < minWordLen) {
          theWord = words[i];
          minWordLen = theWord.length();
        }
      }
    }
    return theWord;
  }

  public boolean isContains(int[] plate, int[] word) {
    for (int i = 0; i < plate.length; i++) {
      if (word[i] < plate[i]) {
        return false;
      }
    }
    return true;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

