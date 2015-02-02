package edu.hawaii.ics613;

/**
 * Prints the sum of all multiples of 3 or 5 less than 1000.
 *
 * Created by Branden Ogata on 2/1/2015.
 *
 */

public class ProjectEulerOne {
  public static void main(String[] args) {
    int total = 0;

    for (int i = 0; i < 1000; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
        total += i;
      }
    }

    System.out.println("Total: " + total);
  }
}
