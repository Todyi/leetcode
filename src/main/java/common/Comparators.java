package common;

/**
 * Copyright (c) 2020 by [sess]
 *
 * @ClassName: Comparators
 * @Description:
 * @author: hdy
 * @version: V1.0
 * @Date: 2020-04-21 11:42:45
 */

public class Comparators {

  public static boolean isSame(int[] array0, int[] array1) {
    if (array0 == null && array1 == null) {
      return true;
    }
    if (array0 == null || array1 == null) {
      return false;
    }
    if (array0.length != array1.length) {
      return false;
    }
    for (int i = 0; i < array0.length; i++) {
      if (array0[i] != array1[i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isSame(int[][] array0, int[][] array1) {
    if (array0 == null && array1 == null) {
      return true;
    }
    if (array0 == null || array1 == null) {
      return false;
    }
    if (array0.length != array1.length) {
      return false;
    }
    for (int i = 0; i < array0.length; i++) {
      if (!isSame(array0[i],array1[i])) {
        return false;
      }
    }
    return true;
  }

  public static boolean isSame(Integer[] array0, Integer[] array1) {
    if (array0 == null && array1 == null) {
      return true;
    }
    if (array0 == null || array1 == null) {
      return false;
    }
    if (array0.length != array1.length) {
      return false;
    }
    for (int i = 0; i < array0.length; i++) {
      if (!array0[i].equals(array1[i])) {
        return false;
      }
    }
    return true;
  }

  public static boolean isSame(char[] array0, char[] array1) {
    if (array0 == null && array1 == null) {
      return true;
    }
    if (array0 == null || array1 == null) {
      return false;
    }
    if (array0.length != array1.length) {
      return false;
    }
    for (int i = 0; i < array0.length; i++) {
      if (array0[i] != array1[i]) {
        return false;
      }
    }
    return true;
  }

  public static boolean isSame(String[] array0, String[] array1) {
    if (array0 == null && array1 == null) {
      return true;
    }
    if (array0 == null || array1 == null) {
      return false;
    }
    if (array0.length != array1.length) {
      return false;
    }
    for (int i = 0; i < array0.length; i++) {
      if (!array0[i].equals(array1[i])) {
        return false;
      }
    }
    return true;
  }


  public static boolean isSame(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val == q.val) {
      return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
    return false;
  }

  public static boolean isSame(ListNode p, ListNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val == q.val) {
      return isSame(p.next, q.next);
    }
    return false;
  }

  public static boolean isSame(Double[] array0, Double[] array1) {
    if (array0 == null && array1 == null) {
      return true;
    }
    if (array0 == null || array1 == null) {
      return false;
    }
    if (array0.length != array1.length) {
      return false;
    }
    for (int i = 0; i < array0.length; i++) {
      if (!array0[i].equals(array1[i])) {
        return false;
      }
    }
    return true;
  }

}
