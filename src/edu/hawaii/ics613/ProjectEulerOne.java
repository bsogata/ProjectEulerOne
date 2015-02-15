package edu.hawaii.ics613;

/**
 * Prints the sum of all multiples of 3 or 5 less than 1000.
 *
 * Created by Branden Ogata on 2/1/2015.
 *
 */

public class ProjectEulerOne {

  /**
   * Sums all numbers less than 1000 that are divisble by three or five.
   *
   * @param args    Not used.
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
   * Returns the number given if said number is divisible by 3 or 5.
   *
   * @param number    The int equal to the number to examine.
   *
   * @return An int equal to the parameter if divisible by 3 or 5,
   *                         0 otherwise.
   *
   */

  public static int divisibleByThreeOrFive(int number) {
    if ((number % 3 == 0) || (number % 5 == 0)) {
      return number;
    }
    else {
      return 0;
    }
  }
}
