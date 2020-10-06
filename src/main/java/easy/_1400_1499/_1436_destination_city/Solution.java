package easy._1400_1499._1436_destination_city;

//You are given the array paths, where paths[i] = [cityAi, cityBi] means 
// there exists a direct path going from cityAi to cityBi. 
// Return the destination city, that is, the city without any path outgoing to another city. 
//
// It is guaranteed that the graph of paths forms a line without any loop, 
// therefore, there will be exactly one destination city. 
//
// 
// Example 1: 
//
// 
//Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]
//]
//Output: "Sao Paulo" 
//Explanation: Starting at "London" city you will reach "Sao Paulo" city which i
//s the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -
//> "Sao Paulo".
// 
//
// Example 2: 
//
// 
//Input: paths = [["B","C"],["D","B"],["C","A"]]
//Output: "A"
//Explanation: All possible trips are:
//"D" -> "B" -> "C" -> "A".
//"B" -> "C" -> "A".
//"C" -> "A".
//"A".
//Clearly the destination city is "A".
// 
//
// Example 3: 
//
// 
//Input: paths = [["A","Z"]]
//Output: "Z"
// 
//
// 
// Constraints: 
//
// 
// 1 <= paths.length <= 100 
// paths[i].length == 2 
// 1 <= cityAi.length, cityBi.length <= 10 
// cityAi != cityBi 
// All strings consist of lowercase and uppercase English letters and the space 
//character. 
// 
// Related Topics String 
// 👍 372 👎 26


import java.util.HashSet;
import java.util.List;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

  //  解答成功:
  //  执行耗时:1 ms,击败了100.00% 的Java用户
  //  内存消耗:38.6 MB,击败了97.43% 的Java用户
  public String destCity(List<List<String>> paths) {
    Set<String> outMap = new HashSet<>();
    for (List<String> path : paths) {
      outMap.add(path.get(0));
    }
    for (List<String> path : paths) {
      if (!outMap.contains(path.get(1))) {
        return path.get(1);
      }
    }
    return null;
  }
}
//leetcode submit region end(Prohibit modification and deletion)

