package medium._0100_0199._133_clone_graph;


import common.Node;
import java.util.HashMap;
import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class TestSet {

  public Node buildNode(Integer[][] arr) {
    if (arr == null || arr.length < 1) {
      return null;
    }
    HashMap<Integer, Node> map = new HashMap<>();
    Node head = new Node(1);
    map.put(1, head);
    fillNeighbors(map, head, arr[0]);
    for (int i = 1; i < arr.length; i++) {
      Node node;
      if (map.containsKey(i + 1)) {
        node = map.get(i + 1);
      } else {
        node = new Node(i + 1);
        map.put(i + 1, node);
      }
      fillNeighbors(map, node, arr[i]);
    }
    return head;
  }

  public void fillNeighbors(HashMap<Integer, Node> map, Node node, Integer[] arr) {
    for (int i = 0; i < arr.length; i++) {
      Node neighbor;
      if (map.containsKey(arr[i])) {
        neighbor = map.get(arr[i]);
      } else {
        neighbor = new Node(arr[i]);
        map.put(arr[i], neighbor);
      }
      node.neighbors.add(neighbor);
    }
  }

  public boolean valid(HashSet<Integer> validMap, Node source, Node clone) {
    if (source == null && clone == null){
      return true;
    }
    Assert.assertTrue(source.val == clone.val);
    Assert.assertTrue(source.neighbors.size() == clone.neighbors.size());
    for (int i = 0; i < source.neighbors.size(); i++) {
      Node sourceN = source.neighbors.get(i);
      Node cloneN = clone.neighbors.get(i);
      if (!validMap.contains(sourceN.val)) {
        validMap.add(sourceN.val);
        valid(validMap, sourceN, cloneN);
      }
    }
    return true;
  }

  @Test
  public void test0() {
    Node node = buildNode(new Integer[][]{{2, 4}, {1, 3}, {2, 4}, {1, 3}});
    Node solution = new medium._0100_0199._133_clone_graph.Solution()
        .cloneGraph(node);
    valid(new HashSet<>(), node, solution);
  }

  @Test
  public void test1() {
    Node node = buildNode(new Integer[][]{{}});
    Node solution = new medium._0100_0199._133_clone_graph.Solution()
        .cloneGraph(node);
    valid(new HashSet<>(), node, solution);
  }
  
  @Test
  public void test2() {
    Node node = buildNode(new Integer[][]{});
    Node solution = new medium._0100_0199._133_clone_graph.Solution()
        .cloneGraph(node);
    valid(new HashSet<>(), node, solution);
  }
  
  @Test
  public void test3() {
    Node node = buildNode(new Integer[][]{{2},{1}});
    Node solution = new medium._0100_0199._133_clone_graph.Solution()
        .cloneGraph(node);
    valid(new HashSet<>(), node, solution);
  }


}
