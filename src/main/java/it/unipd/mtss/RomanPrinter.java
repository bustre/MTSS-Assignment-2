////////////////////////////////////////////////////////////////////
// Alessandro Bustreo 2042383
// Lorenzo Rosson 2042349
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Arrays;

public class RomanPrinter {

  static final String[] romanLetters = { "I", "V"};
  static final String[][] romanPatterns = {
      { " _____ ", "__      __"},
      { "|_   _|", "\\ \\    / /"},
      { "  | |  ", " \\ \\  / / "},
      { "  | |  ", "  \\ \\/ /  "},
      { " _| |_ ", "   \\  /   "},
      { "|_____|", "    \\/    "}
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