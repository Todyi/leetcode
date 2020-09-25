package easy._1200_1299._1237_find_positive_integer_solution_for_a_given_equation;

/**
 * Copyright (c) 2020 by [sess]
 *
 * @ClassName: CustomFunction
 * @Description:
 * @author: hdy
 * @version: V1.0
 * @Date: 2020-09-25 15:56:45
 */

public class CustomFunction {

  int type;

  public CustomFunction(int type) {
    this.type = type;
  }

  // Returns f(x, y) for any given positive integers x and y.
  // Note that f(x, y) is increasing with respect to both x and y.
  // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
  public int f(int x, int y) {
    switch (type) {
      case 1:
        return x + y;
      case 2:
      default:
        return x * y;
    }
  }

}
