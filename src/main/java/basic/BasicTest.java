package basic;

import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
  public static Option<Integer> power(Integer i, Integer n) {
    if (i  < 0 || n < 0 || n > 100)
    {
      return Option.none();
    }
    if (n == 0 || i == 1)
    {
      return Option.some(1);
    }
    if (i == 0)
    {
      return Option.some(0);
    }
    Integer res = i;
    for (int pow = 1; pow < n; pow++)
    {
      res *= i;
    }
    return Option.some(res);
  }
}
