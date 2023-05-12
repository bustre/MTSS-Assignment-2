////////////////////////////////////////////////////////////////////
// Alessandro Bustreo 2042383
// Lorenzo Rosson 2042349
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
  public static String print(int num) {
    return printAsciiArt(IntegerToRoman.converter(num));
  }

  private static String printAsciiArt(String romanNumber) {
    String[] container = romanNumber.split("");

    String result = "";

    for (int i = 0; i < 6; i++) {

      String line = "";

      for (int j = 0; j < container.length; j++) {

        if (container[j].equals("I")) {
          switch (i) {
            case 0:
              line = line + (" _____ ");
              break;

              case 1:
              line = line + ("|_   _|");
              break;

              case 2:
              line = line + ("  | |  ");
              break;

              case 3:
              line = line + ("  | |  ");
              break;
            
              case 4:
              line = line + (" _| |_ ");
              break;

              case 5:
              line = line + ("|_____|");
              break;
          }
        }
      }
      result = result + line + "\n";
    }

    return result;
  }
}