package common;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2020 by tody.cc
 *
 * @ClassName: TreeNode
 * @Description:
 * @author: tody
 * @Date: 2020-04-19 16:32:34
 */

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  public static TreeNode buildTree(Integer[] treeArr) {
    if (treeArr.length == 0) {
      return null;
    }
    TreeNode root = new TreeNode(treeArr[0]);
    List<TreeNode> queue = new ArrayList<>();
    boolean left = true;
    TreeNode pointer = root;
    for (int i = 1; i < treeArr.length; i++) {
      if (left) {
        if (treeArr[i] != null) {
          pointer.left = new TreeNode(treeArr[i]);
          queue.add(pointer.left);
        }
      } else {
        if (treeArr[i] != null) {
          pointer.right = new TreeNode(treeArr[i]);
          queue.add(pointer.right);
        }
        pointer = queue.get(0);
        queue.remove(0);
      }
      left = !left;
    }
    return root;
  }
}
