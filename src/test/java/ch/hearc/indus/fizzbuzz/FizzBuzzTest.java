/*
 * Ulysse Rosselet, HE-Arc, 2017
 */

package ch.hearc.indus.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  private static final int CAPACITY = 100;
  private FizzBuzz fb;
  private ArrayList<String> cheatSheet;


  @Before
  public void initFizzBuzz() {
    fb = new FizzBuzz();
    cheatSheet = fb.fizzBuzzCheatSheet(CAPACITY);
    System.out.println(cheatSheet);
  }

  @Test
  public void testListSize() {
    assertEquals(CAPACITY, cheatSheet.size());
  }

  @Test
  public void replaceMultiplesOf3ByFizz() {
    for (int i = 0; i < cheatSheet.size(); i++) {
      int pos = (i + 1) % 3;
      if (pos == 0) {
        if ((i + 1) % 5 == 0) {
          assertEquals(0, cheatSheet.get(i).indexOf("Fizz"));
        } else {
          assertTrue(cheatSheet.get(i).equals("Fizz"));
        }
      }
    }
  }

  @Test
  public void replaceMultiplesOf5ByBuzz() {
    for (int i = 0; i < cheatSheet.size(); i++) {
      int pos = (i + 1) % 5;
      if (pos == 0) {
        if ((i + 1) % 3 == 0) {
          assertEquals(4, cheatSheet.get(i).indexOf("Buzz"));
        } else {
          assertTrue(cheatSheet.get(i).equals("Buzz"));
        }
      }
    }
  }

  @Test
  public void replaceMultiplesOf3and5ByFizzBuzz() {
    for (int i = 0; i < cheatSheet.size(); i++) {
      int pos = (i + 1) % 15;
      if (pos == 0) {
        assertTrue(cheatSheet.get(i).contentEquals("FizzBuzz"));
      }
    }
  }

}