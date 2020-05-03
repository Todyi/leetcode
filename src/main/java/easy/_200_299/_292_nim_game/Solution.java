package easy._200_299._292_nim_game;

//You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The
//one who removes the last stone will be the winner. You will take the first turn to remove the stones.
//
// Both of you are very clever and have optimal strategies for the game. Write a
// function to determine whether you can win the game given the number of stones in the heap.
//
// Example:
//
//
//Input: 4
//Output: false
//Explanation: If there are 4 stones in the heap, then you will never win the game;
//             No matter 1, 2, or 3 stones you remove, the last stone will always be
//             removed by your friend. Related Topics Brainteaser Minimax


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:0 ms,击败了100.00% 的Java用户
  //  内存消耗:36.2 MB,击败了7.69% 的Java用户
  public boolean canWinNim(int n) {
    //k steps to finish the game. s0^s1^...^sk=0 is the certainly losing form.
    //you can only change the situation to s0^...sk-1<>0, and next turn your friend will change the situation to s0^...sk-2=0(another certainly losing form) by removing the same number like you.
    return !(n % 4 == 0);
  }
}
//leetcode submit region end(Prohibit modification and deletion)

