/**
 * Project: TextBased
 * File: Diamond.java
 */

/**
 * This is a very simple program that prints out a diamond of the given size.
 * 
 * @author Jonathan Lane-Smith
 */
public class Diamond {

  public static void main(String[] HeyMrTan) {

    int num = 13;
    int size = 2 * num - 1;

    for (int i = 1; i <= size; i++) {

      int k = i;
      if (k > num)
        k = size - k + 1;
      k = k * 2 - 1;

      for (int j = 1; j <= size; j++) {

        if (j <= (size - k) / 2 || (size - j + 1) <= (size - k) / 2)
          System.out.print(" ");
        else if (j > (size - k) / 2)
          System.out.print("*");

      }
      System.out.println();
    }
  }
}