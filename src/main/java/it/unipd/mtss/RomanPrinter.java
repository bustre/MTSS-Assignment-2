////////////////////////////////////////////////////////////////////
// Alessandro Bustreo 2042383
// Lorenzo Rosson 2042349
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Arrays;

public class RomanPrinter {

  static final String[] romanLetters = { "I", "V", "X", "L", "C", "D" };
  static final String[][] romanPatterns = {
      { " _____ ", "__      __",   "__   __",  " _      ", "  _____ ",  " _____   " },
      { "|_   _|", "\\ \\    / /", "\\ \\ / /","| |     ", " / ____|",  "|  __ \\  " },
      { "  | |  ", " \\ \\  / / ", " \\ V / ", "| |     ", "| |     ",  "| |  | | " },
      { "  | |  ", "  \\ \\/ /  ", "  >  < ",  "| |     ", "| |     ",  "| |  | | " },
      { " _| |_ ", "   \\  /   ",  " / . \\ ", "| |____ ", "| |____ ",  "| |__| | "  },
      { "|_____|", "    \\/    ",  "/_/\\ _\\","|______|", " \\_____|", "|_____/  "}
  };

  public static String print(int num) {
    return printAsciiArt(IntegerToRoman.converter(num));
  }

  public static String printAsciiArt(String romanNumber) {
    String[] container = romanNumber.split("");
    String result = "";

    for (int i = 0; i < 6; i++) {
      String line = "";
      
      for (int j = 0; j < container.length; j++) {
        int index = Arrays.asList(romanLetters).indexOf(container[j]);
        line += romanPatterns[i][index];
      }
      result = result + line + "\n";
    }

    return result;
  }

}