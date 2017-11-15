/*
 * Ulysse Rosselet, HE-Arc, 2017
 */

package ch.hearc.indus.fizzbuzz;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 *
 */
public class FizzBuzz {

  /**
   *
   *
   * @param length
   * @return
   */
  public ArrayList<String> fizzBuzzCheatSheet(int length) {
    ArrayList<String> cheatSheet = new ArrayList(length);
    for (int i = 0; i < length; i++) {
      cheatSheet.add(i, String.valueOf(i + 1));
    }
    return replaceMultiplesOf3and5ByFizzBuzz(cheatSheet);
  }

  public ArrayList<String> replaceMultiplesOf3ByFizz(ArrayList<String> list) {
    return list.stream().map(s -> {
      int n = Integer.parseInt(s);
      if ((n % 3) == 0 && (n % 5) == 0) {
        return "FizzBuzz";
      } else if ((n % 3) == 0) {
        return "Fizz";
      } else if ((n % 5) == 0) {
        return "Buzz";
      } else {
        return s;
      }
    }).collect(
        Collectors.toCollection(ArrayList::new));
  }

  public ArrayList<String> replaceMultiplesOf3and5ByFizzBuzz(ArrayList<String> list) {
    return list.stream().map(s -> {
      int n = Integer.parseInt(s);
      String str = "";
      if ((n % 3) == 0) {
        str += "Fizz";
      }
      if ((n % 5) == 0) {
        str += "Buzz";
      }
      if (str.isEmpty()) {
        return s;
      } else {
        return str;
      }
    }).collect(
        Collectors.toCollection(ArrayList::new));
  }
}
