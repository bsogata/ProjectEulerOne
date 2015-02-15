package tests;

import edu.hawaii.ics613.ProjectEulerOne;

import static org.junit.Assert.assertEquals;

public class ProjectEulerOneTest {

  @org.junit.Test
  public void testDivisibleByThreeOrFive() throws Exception {
    assertEquals(3, ProjectEulerOne.divisibleByThreeOrFive(3));
    assertEquals(0, ProjectEulerOne.divisibleByThreeOrFive(4));
    assertEquals(5, ProjectEulerOne.divisibleByThreeOrFive(5));
  }
}