package easy._100_199._172_factorial_trailing_zeroes;

//Given an integer n, return the number of trailing zeroes in n!.
//
// Example 1:
//
//
//Input: 3
//Output: 0
//Explanation: 3! = 6, no trailing zero.
//
// Example 2:
//
//
//Input: 5
//Output: 1
//Explanation: 5! = 120, one trailing zero.
//
// Note: Your solution should be in logarithmic time complexity.
// Related Topics Math


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //相当于求*5的次数n	n!
  //625!含零的个数=625/5+625/5/5+625/5/5/5+625/5/5/5/5=125+25+5+1
  //624!含零的个数=624/5+624/5/5+624/5/5/5+624/5/5/5/5=124+24+4+0
  //0	  1
  //1	  1
  //2	  2
  //3	  6
  //4	  24
  //5	  120
  //6	  720
  //7	  5,040
  //8	  40,320
  //9	  362,880
  //10	3,628,800
  //11	39,916,800
  //12	479,001,600
  //13	6,227,020,800
  //14	87,178,291,200
  //15	1,307,674,368,000
  //16	20,922,789,888,000
  //17	355,687,428,096,000
  //18	6,402,373,705,728,000
  //19	121,645,100,408,832,000
  //20	2,432,902,008,176,640,000
  //21	51,090,942,171,709,440,000
  //22	1,124,000,727,777,607,680,000
  //23	25,852,016,738,884,976,640,000
  //24	620,448,401,733,239,439,360,000
  //25	15,511,210,043,330,985,984,000,000

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.7 MB,击败了7.69% 的Java用户
  public int trailingZeroes(int n) {
    int zero = 0;
    while (0 < n) {
      n = n / 5;
      zero += n;
    }
    return zero;

//    if (n == 0) {
//      return 0;
//    }
//    return n / 5 + trailingZeroes(n / 5);
  }

}
//leetcode submit region end(Prohibit modification and deletion)

