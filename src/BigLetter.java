/**
 * Project: TextBased
 * File: BigLetter.java
 */

import java.util.Scanner;

/**
 * This is a simple program which takes in a sentence and prints it out in a bigger and better font.
 * 
 * @author Jonathan Lane-Smith
 */
public class BigLetter {

  public static void addToArray(int line[][][], char c, int numletter, int numword) {

    int numpoint = numletter * 7;
    int[] array = new int[25];

    if (c == 'A') {
      int[] info = { 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1 };
      array = info;
    } else if (c == 'B') {
      int[] info = { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
      array = info;
    } else if (c == 'C') {
      int[] info = { 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
      array = info;
    } else if (c == 'D') {
      int[] info = { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
      array = info;
    } else if (c == 'E') {
      int[] info = { 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
      array = info;
    } else if (c == 'F') {
      int[] info = { 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
      array = info;
    } else if (c == 'G') {
      int[] info = { 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == 'H') {
      int[] info = { 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1 };
      array = info;
    } else if (c == 'I') {
      int[] info = { 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1 };
      array = info;
    } else if (c == 'J') {
      int[] info = { 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0 };
      array = info;
    } else if (c == 'K') {
      int[] info = { 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0 };
      array = info;
    } else if (c == 'L') {
      int[] info = { 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
      array = info;
    } else if (c == 'M') {
      int[] info = { 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1 };
      array = info;
    } else if (c == 'N') {
      int[] info = { 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1 };
      array = info;
    } else if (c == 'O') {
      int[] info = { 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == 'P') {
      int[] info = { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
      array = info;
    } else if (c == 'Q') {
      int[] info = { 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1 };
      array = info;
    } else if (c == 'R') {
      int[] info = { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1 };
      array = info;
    } else if (c == 'S') {
      int[] info = { 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
      array = info;
    } else if (c == 'T') {
      int[] info = { 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };
      array = info;
    } else if (c == 'U') {
      int[] info = { 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == 'V') {
      int[] info = { 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0 };
      array = info;
    } else if (c == 'W') {
      int[] info = { 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1 };
      array = info;
    } else if (c == 'X') {
      int[] info = { 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1 };
      array = info;
    } else if (c == 'Y') {
      int[] info = { 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };
      array = info;
    } else if (c == 'Z') {
      int[] info = { 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1 };
      array = info;
    } else if (c == '.') {
      int[] info = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 };
      array = info;
    } else if (c == '-') {
      int[] info = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      array = info;
    } else if (c == ',') {
      int[] info = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0 };
      array = info;
    } else if (c == '?') {
      int[] info = { 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };
      array = info;
    } else if (c == '!') {
      int[] info = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 };
      array = info;
    } else if (c == 39) { // Apostrophe
      int[] info = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      array = info;
    } else if (c == 34) { // Double apostrophe
      int[] info = { 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      array = info;
    } else if (c == '$') {
      int[] info = { 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0 };
      array = info;
    } else if (c == '(') {
      int[] info = { 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0 };
      array = info;
    } else if (c == ')') {
      int[] info = { 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 };
      array = info;
    } else if (c == '1') {
      int[] info = { 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == '2') {
      int[] info = { 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1 };
      array = info;
    } else if (c == '3') {
      int[] info = { 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == '4') {
      int[] info = { 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0 };
      array = info;
    } else if (c == '5') {
      int[] info = { 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
      array = info;
    } else if (c == '6') {
      int[] info = { 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == '7') {
      int[] info = { 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 };
      array = info;
    } else if (c == '8') {
      int[] info = { 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == '9') {
      int[] info = { 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0 };
      array = info;
    } else if (c == '0') {
      int[] info = { 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0 };
      array = info;
    } else if (c == '_') {
      int[] info = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1 };
      array = info;
    } else if (c == '+') {
      int[] info = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 };
      array = info;
    } else if (c == '=') {
      int[] info = { 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 };
      array = info;
    } else if (c == '#') {
      int[] info = { 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0 };
      array = info;
    } else if (c == ']') {
      int[] info = { 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 };
      array = info;
    } else if (c == '[') {
      int[] info = { 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0 };
      array = info;
    } else if (c == '/') {
      int[] info = { 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0 };
      array = info;
    } else if (c == ':') {
      int[] info = { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 };
      array = info;
    } else if (c == ';') {
      int[] info = { 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 };
      array = info;
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        line[numpoint + j][i][numword] = array[5 * i + j];
      }
    }
  }

  public static void main(String[] OhHeyThereDave) {

    int[][][] line = new int[700][5][100];

    Scanner s = new Scanner(System.in);
    System.out.println("Enter a sentence, up to 700 characters and up to 100 words:");
    String text = s.nextLine().toUpperCase();
    text += " ";
    
    String character = null;
    System.out.println("Enter 1 or more characters:");
    character = s.nextLine().toUpperCase();

    s.close();

    int numwords = 0;
    int beginning = 0;
    String[] sentences = new String[100];
    
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == ' ' && (i - beginning > 8 || i == text.length() - 1))
      {
        sentences[numwords] = text.substring(beginning, i);
        beginning = i + 1;
        numwords++;
      }
    }

    for (int i = 0; i < numwords; i++) {
      for (int j = 0; j < sentences[i].length(); j++) {
        char letter = sentences[i].charAt(j);
        addToArray(line, letter, j, i);
      }
    }

    for (int k = 0; k < numwords; k++) {
      for (int i = 0; i < 5; i++) {
        for (int j = 0; j < sentences[k].length() * 7; j++) {
          
          if (line[j][i][k] == 1)
              System.out.print(character);
          else {
            for (int m = 0; m < character.length(); m++)
              System.out.print(" ");
          }
        }
        System.out.println();
      }
      System.out.println();
    }

  }
}
