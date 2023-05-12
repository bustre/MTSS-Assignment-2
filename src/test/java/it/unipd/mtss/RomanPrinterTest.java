package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

  @Test
  public void TestPrintAsciiArt() {
    // Arrange
    String result1 = 
        " _____ " + "\n" +
        "|_   _|" + "\n" +
        "  | |  " + "\n" +
        "  | |  " + "\n" +
        " _| |_ " + "\n" +
        "|_____|" + "\n";

    String result3 = 
        " _____  _____  _____ " + "\n" +
        "|_   _||_   _||_   _|" + "\n" +
        "  | |    | |    | |  " + "\n" +
        "  | |    | |    | |  " + "\n" +
        " _| |_  _| |_  _| |_ " + "\n" +
        "|_____||_____||_____|" + "\n";

    String result4 =
    " _____ __      __"  + "\n" +
    "|_   _|\\ \\    / /"  + "\n" +
    "  | |   \\ \\  / / "  + "\n" +
    "  | |    \\ \\/ /  "  + "\n" +
    " _| |_    \\  /   "  + "\n" +
    "|_____|    \\/    "  + "\n";

    String result6 =
    "__      __ _____ "  + "\n" +
    "\\ \\    / /|_   _|"  + "\n" +
    " \\ \\  / /   | |  "  + "\n" +
    "  \\ \\/ /    | |  "  + "\n" +
    "   \\  /    _| |_ "  + "\n" +
    "    \\/    |_____|"  + "\n";

    String result9 = 
    " _____ __   __" + "\n" +
    "|_   _|\\ \\ / /" + "\n" +
    "  | |   \\ V / " + "\n" +
    "  | |    >  < " + "\n" +
    " _| |_  / . \\ " + "\n" +
    "|_____|/_/\\ _\\" + "\n";

    // Act
    String value1 = RomanPrinter.print(1);
    String value3 = RomanPrinter.print(3);
    String value4 = RomanPrinter.print(4);
    String value6 = RomanPrinter.print(6);
    String value9 = RomanPrinter.print(9);

    // Assert
    assertEquals(value1, result1);
    assertEquals(value3, result3);
    assertEquals(value4, result4);
    assertEquals(value6, result6);
    assertEquals(value9, result9);
  }
}