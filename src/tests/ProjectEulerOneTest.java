package tests;

import edu.hawaii.ics613.ProjectEulerOne;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerOne class.
 *
 * Created by Branden Ogata on 2/15/2015.
 *
 */

public class ProjectEulerOneTest {

  /**
   * Tests the divisibleByThreeOrFive method.
   *
   * @throws Exception when there is an error (which should never happen here).
   *
   */

  @Test
  public void testDivisibleByThreeOrFive() throws Exception {
    assertEquals(3, ProjectEulerOne.divisibleByThreeOrFive(3));
    assertEquals(0, ProjectEulerOne.divisibleByThreeOrFive(4));
    assertEquals(5, ProjectEulerOne.divisibleByThreeOrFive(5));
  }
}