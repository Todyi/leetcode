package easy._700_799._762_prime_number_of_set_bits_in_binary_representation;

//
//Given two integers L and R, find the count of numbers in the range [L, R] (inclusive)
// having a prime number of set bits in their binary representation.
//
//(Recall that the number of set bits an integer has is the number of 1s present
// when written in binary. For example, 21 written in binary is 10101 which has 3 set bits.
// Also, 1 is not a prime.)
//
//
// Example 1:
//Input: L = 6, R = 10
//Output: 4
//Explanation:
//6 -> 110 (2 set bits, 2 is prime)
//7 -> 111 (3 set bits, 3 is prime)
//9 -> 1001 (2 set bits , 2 is prime)
//10->1010 (2 set bits , 2 is prime)
//
//
// Example 2:
//Input: L = 10, R = 15
//Output: 5
//Explanation:
//10 -> 1010 (2 set bits, 2 is prime)
//11 -> 1011 (3 set bits, 3 is prime)
//12 -> 1100 (2 set bits, 2 is prime)
//13 -> 1101 (3 set bits, 3 is prime)
//14 -> 1110 (3 set bits, 3 is prime)
//15 -> 1111 (4 set bits, 4 is not prime)
//
//
// Note:
// L, R will be integers L <= R in the range [1, 10^6].
// R - L will be at most 10000.
// Related Topics Bit Manipulation
// 👍 244 👎 330


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  Runtime: 2 ms, faster than 99.74% of Java online submissions for Prime Number of Set Bits in Binary Representation.
  //  Memory Usage: 36.3 MB, less than 53.03% of Java online submissions for Prime Number of Set Bits in Binary Representation.
  int[] prime = {
      0, 0, 1, 1, 0, 1, 0, 1,
      0, 0, 0, 1, 0, 1, 0, 0,
      0, 1, 0, 1, 0, 0, 0, 1,
      0, 0, 0, 0, 0, 1, 0, 1};

//  public int countPrimeSetBits(int L, int R) {
//    int count = 0;
//    for (int i = L; i <= R; i++) {
//      count += prime[Integer.bitCount(i)];
//    }
//    return count;
//  }

  //  Runtime: 1 ms, faster than 100.00% of Java online submissions for Prime Number of Set Bits in Binary Representation.
  //  Memory Usage: 36.2 MB, less than 57.58% of Java online submissions for Prime Number of Set Bits in Binary Representation.
  public int countPrimeSetBits(int L, int R) {
    int tmp = L, count = 0, prime = 0b10100000100010100010100010101100;
    while (tmp != 0) {
      tmp = tmp & (tmp - 1);
      count++;
    }
    int num = (prime >>> count) & 1;

    for (int i = L + 1; i <= R; i++) {
      tmp = i;
      count++;
      while (0 == (tmp & 1)) {
        count--;
        tmp >>>= 1;
      }
      num += (prime >>> count) & 1;
    }
    return num;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

