/*
 * Ulysse Rosselet, HE-Arc, 2017
 */

package ch.hearc.indus.fizzbuzz;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  public static final int CAPACITY = 100;
  private FizzBuzz fb;
  private ArrayList cheatSheet;

  @Before
  public void initFizzBuzz() {
    fb = new FizzBuzz();
    cheatSheet = fb.fizzBuzzCheatSheet(CAPACITY);
  }

  @Test
  public void testListSize() {
    assertEquals(CAPACITY, cheatSheet.size());
    System.out.println(cheatSheet);
  }

  @Test
  public void testSequence() {
    for(int i=0; i<CAPACITY;i++){
      assertEquals(String.valueOf(i+1),cheatSheet.get(i));
    }
  }

  @Test
  public void replaceMultiplesOf3ByFizz(){
    System.out.println(fb.replaceMultiplesOf3ByFizz(cheatSheet));
  }

  @Test
  public void replaceMultiplesOf3and5ByFizzBuzz(){
    System.out.println(fb.replaceMultiplesOf3and5ByFizzBuzz(cheatSheet));
  }

}