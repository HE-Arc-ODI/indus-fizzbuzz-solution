/*
 * Ulysse Rosselet, HE-Arc, 2017
 */

package ch.hearc.indus.fizzbuzz;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * FizzBuzz cheatsheet generator stage 1. The generator prints the numbers from 1 to 100. But for
 * multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz".
 */
public class FizzBuzz {

  /**
   * Generates the FizzBuzz game cheatsheet of the given length.
   * @param length length of the cheatsheet
   * @return the cheatsheet.
   */
  public ArrayList<String> fizzBuzzCheatSheet(int length) {
    ArrayList<String> cheatSheet = new ArrayList<String>(length);
    for (int i = 0; i < length; i++) {
      cheatSheet.add(i, String.valueOf(i + 1));
    }
    return replaceMultiplesOf3and5ByFizzBuzz(cheatSheet);
  }


  private ArrayList<String> replaceMultiplesOf3and5ByFizzBuzz(ArrayList<String> list) {
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
