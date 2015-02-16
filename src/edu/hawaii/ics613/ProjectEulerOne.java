package edu.hawaii.ics613;

/**
 * Prints the sum of all multiples of 3 or 5 less than 1000.
 *
 * Created by Branden Ogata on 2/1/2015.
 *
 */

public class ProjectEulerOne {

  /**
   * Prints the sum of all multiples of 3 or 5 less than 1000.
   *
   * @param args Not used.
   *
   */

  public static void main(String[] args) {
    int total = 0;

    for (int i = 0; i < 1000; i++) {
      total += divisibleByThreeOrFive(i);
    }

    System.out.println("Total: " + total);
  }

  /**
   * Returns either the given number or zero (see return tag for details).
   *
   * @param number    The int equal to the number to examine.
   * @return An int equal to the parameter if divisble by three or five,
   *                         0 otherwise.
   *
   */

  public static int divisibleByThreeOrFive(int number) {
    return ((number % 3 == 0) || (number % 5 == 0)) ? (number) : (0);
  }
}
