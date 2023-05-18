////////////////////////////////////////////////////////////////////
// Alessandro Bustreo 2042383
// Lorenzo Rosson 2042349
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Arrays;

public class RomanPrinter {

  static final String[] romanLetters = { "I", "V", "X", "L", "C", "D", "M" };
  static final String[][] romanPatterns = {
      { " _____ ", "__      __", "__   __", " _      ", "  _____ ", " _____   ", " __  __ " },
      { "|_   _|", "\\ \\    / /", "\\ \\ / /", "| |     ", " / ____|", "|  __ \\  ", "|  \\/  |" },
      { "  | |  ", " \\ \\  / / ", " \\ V / ", "| |     ", "| |     ", "| |  | | ", "| \\  / |" },
      { "  | |  ", "  \\ \\/ /  ", "  >  < ", "| |     ", "| |     ", "| |  | | ", "| |\\/| |" },
      { " _| |_ ", "   \\  /   ", " / . \\ ", "| |____ ", "| |____ ", "| |__| | ", "| |  | |" },
      { "|_____|", "    \\/    ", "/_/\\ _\\", "|______|", " \\_____|", "|_____/  ", "|_|  |_|" }
  };

  public static String print(int num) {
    return printAsciiArt(IntegerToRoman.converter(num));
  }

  static String printAsciiArt(String romanNumber) {
    if (romanNumber == null) {
      throw new IllegalArgumentException("Roman number cannot be null");
    }

    if (romanNumber.isEmpty()) {
      throw new IllegalArgumentException("String romanNumber cannot be empty");
    }

    long illegalLetterCounter = romanNumber.chars().filter(ch -> {
      for (String letter : romanLetters) {
        if (letter.charAt(0) == ch) {
          return false;
        }
      }

      return true;
    }).count();

    if (illegalLetterCounter > 0) {
      throw new IllegalArgumentException("romanNumber have illegal letters");
    }

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