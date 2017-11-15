/*
 * Ulysse Rosselet, HE-Arc, 2017
 */

package ch.hearc.indus.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FizzBuzzTest {

  private FizzBuzz fb;

  @Before
  public void initFizzBuzz() {
    fb = new FizzBuzz();
  }

  @Test
  public void testListSize() {
    int capacity = 100;
    assertEquals(capacity, fb.fizzBuzzCheatSheet(capacity).size());
  }

}