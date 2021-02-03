package medium._0100_0199._187_repeated_dna_sequences;

//All DNA is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', a/nd 'T',
// for example: "ACGAATTCCG".
// When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
//
// Write a function to find all the 10-letter-long sequences (substrings)
// that occur more than once in a DNA molecule.
//
// 
// Example 1: 
// Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//Output: ["AAAAACCCCC","CCCCCAAAAA"]
// Example 2: 
// Input: s = "AAAAAAAAAAAAA"
//Output: ["AAAAAAAAAA"]
// 
// 
// Constraints: 
//
// 
// 0 <= s.length <= 105 
// s[i] is 'A', 'C', 'G', or 'T'. 
// 
// Related Topics Hash Table Bit Manipulation 
// 👍 1104 👎 327


import java.util.ArrayList;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 3 ms, faster than 100.00% of Java online submissions for Repeated DNA Sequences.
  //  Memory Usage: 40.3 MB, less than 99.63% of Java online submissions for Repeated DNA Sequences.
  public List<String> findRepeatedDnaSequences(String s) {
    List<String> result = new ArrayList<>();
    int len = s.length();
    if (len < 11) {
      return result;
    }
    byte[] charMap = new byte[85];
    charMap['A'] = 0;
    charMap['C'] = 1;
    charMap['G'] = 2;
    charMap['T'] = 3;
    int mask = 0xFFFFF, cur = 0, i = 0;
    char[] arr = s.toCharArray();
    byte[] map = new byte[1 << 20];
    for (; i < 10; i++) {
      cur = (cur << 2) | charMap[arr[i]];
    }
    map[cur] = 1;
    for (; i < len; i++) {
      cur = ((cur << 2) & mask) | charMap[arr[i]];
      if (map[cur] == 1) {
        result.add(s.substring(i - 9, i + 1));
      }
      if (map[cur] < 2){
        map[cur]++;
      }
    }
    return result;
  }

}
//leetcode submit region end(Prohibit modification and deletion)

