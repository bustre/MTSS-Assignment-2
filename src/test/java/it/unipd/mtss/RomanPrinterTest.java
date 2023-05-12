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

    // Act
    String value1 = RomanPrinter.print(1);
    String value3 = RomanPrinter.print(3);

    // Assert
    assertEquals(value1, result1);
    assertEquals(value3, result3);
  }
}