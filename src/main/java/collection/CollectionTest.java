package collection;

import io.vavr.control.Option;
import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {
  public static Double power(Double i, Double n) {
    if (n == 0)
    {
      return 1.0;
    }
    Double res = i;
    for (int pow = 1; pow < n; pow++)
    {
      res *= i;
    }
    return res;
  }

  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    List<Double> res = new ArrayList<>();
    for (int i = 0; i < input.size(); i++)
    {
      res.add(power((input.get(i) * 2.0) + 3.0, 5.0));
    }
    return res;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    List<String> res = new ArrayList<>();
    if (input.size() == 0)
    {
      return res;
    }
    for (int i = 0; i < input.size(); i++)
    {
      String temp = input.get(i);
      if (temp.length() == 0)
      {
        res.add("");
        continue;
      }
      char first = Character.toUpperCase(temp.charAt(0));
      temp = first + temp.substring(1);
      res.add(temp.concat(temp));
    }
    return res;
  }

}
