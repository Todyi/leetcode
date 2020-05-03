package easy._201_400._299_bulls_and_cows;

//You are playing the following Bulls and Cows game with your friend: You write
//down a number and ask your friend to guess what the number is. Each time your fr
//iend makes a guess, you provide a hint that indicates how many digits in said gu
//ess match your secret number exactly in both digit and position (called "bulls")
// and how many digits match the secret number but locate in the wrong position (c
//alled "cows"). Your friend will use successive guesses and hints to eventually d
//erive the secret number.
//
// Write a function to return a hint according to the secret number and friend's
// guess, use A to indicate the bulls and B to indicate the cows.
//
// Please note that both secret number and friend's guess may contain duplicate
//digits.
//
// Example 1:
//
//
//Input: secret = "1807", guess = "7810"
//
//Output: "1A3B"
//
//Explanation: 1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
//
// Example 2:
//
//
//Input: secret = "1123", guess = "0111"
//
//Output: "1A1B"
//
//Explanation: The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
//
//
// Note: You may assume that the secret number and your friend's guess only cont
//ain digits, and their lengths are always equal. Related Topics Hash Table


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:4 ms,击败了91.00% 的Java用户
  //  内存消耗:39.2 MB,击败了5.26% 的Java用户
  public String getHint(String secret, String guess) {
    char[] sArr = secret.toCharArray();
    char[] gArr = guess.toCharArray();
    int[] map = new int[10];
    int a = 0;
    int b = 0;
    for (int i = 0; i < sArr.length; i++) {
      if (gArr[i] == sArr[i]) {
        a++;
      } else {
        map[sArr[i] - '0']++;
        if (map[sArr[i] - '0'] < 1){
          b++;
        }
        map[gArr[i] - '0']--;
        if (-1 < map[gArr[i] - '0']){
          b++;
        }
      }
    }

    return a + "A" + b + "B";
  }
}
//leetcode submit region end(Prohibit modification and deletion)

