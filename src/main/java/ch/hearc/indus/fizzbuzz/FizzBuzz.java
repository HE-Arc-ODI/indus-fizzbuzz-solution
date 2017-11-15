/*
 * Ulysse Rosselet, HE-Arc, 2017
 */

package ch.hearc.indus.fizzbuzz;

import java.util.ArrayList;

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
    for(int i = 0; i < length; i++){
      cheatSheet.add(i, String.valueOf(i+1));
    }
    return cheatSheet;
  }
}
