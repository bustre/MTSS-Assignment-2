package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

  @Test
  public void testPrint() {
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
        " _____ __      __" + "\n" +
        "|_   _|\\ \\    / /" + "\n" +
        "  | |   \\ \\  / / " + "\n" +
        "  | |    \\ \\/ /  " + "\n" +
        " _| |_    \\  /   " + "\n" +
        "|_____|    \\/    " + "\n";

    String result6 = 
        "__      __ _____ " + "\n" +
        "\\ \\    / /|_   _|" + "\n" +
        " \\ \\  / /   | |  " + "\n" +
        "  \\ \\/ /    | |  " + "\n" +
        "   \\  /    _| |_ " + "\n" +
        "    \\/    |_____|" + "\n";

    String result9 = 
        " _____ __   __" + "\n" +
        "|_   _|\\ \\ / /" + "\n" +
        "  | |   \\ V / " + "\n" +
        "  | |    >  < " + "\n" +
        " _| |_  / . \\ " + "\n" +
        "|_____|/_/\\ _\\" + "\n";

    String result20 = 
        "__   ____   __" + "\n" +
        "\\ \\ / /\\ \\ / /" + "\n" +
        " \\ V /  \\ V / " + "\n" +
        "  >  <   >  < " + "\n" +
        " / . \\  / . \\ " + "\n" +
        "/_/\\ _\\/_/\\ _\\" + "\n";

    String result39 = 
        "__   ____   ____   __ _____ __   __" + "\n" +
        "\\ \\ / /\\ \\ / /\\ \\ / /|_   _|\\ \\ / /" + "\n" +
        " \\ V /  \\ V /  \\ V /   | |   \\ V / " + "\n" +
        "  >  <   >  <   >  <   | |    >  < " + "\n" +
        " / . \\  / . \\  / . \\  _| |_  / . \\ " + "\n" +
        "/_/\\ _\\/_/\\ _\\/_/\\ _\\|_____|/_/\\ _\\" + "\n";

    String result99 =
        "__   __  _____  _____ __   __" + "\n" + 
        "\\ \\ / / / ____||_   _|\\ \\ / /" + "\n" +
        " \\ V / | |       | |   \\ V / " + "\n" +
        "  >  < | |       | |    >  < "  + "\n" +
        " / . \\ | |____  _| |_  / . \\ "  + "\n" +
        "/_/\\ _\\ \\_____||_____|/_/\\ _\\" + "\n";

    String result488 = 
        "  _____  _____    _      __   ____   ____   ____      __ _____  _____  _____ " + "\n" +
        " / ____||  __ \\  | |     \\ \\ / /\\ \\ / /\\ \\ / /\\ \\    / /|_   _||_   _||_   _|" + "\n" +
        "| |     | |  | | | |      \\ V /  \\ V /  \\ V /  \\ \\  / /   | |    | |    | |  " + "\n" +
        "| |     | |  | | | |       >  <   >  <   >  <   \\ \\/ /    | |    | |    | |  " + "\n" +
        "| |____ | |__| | | |____  / . \\  / . \\  / . \\    \\  /    _| |_  _| |_  _| |_ " + "\n" +
        " \\_____||_____/  |______|/_/\\ _\\/_/\\ _\\/_/\\ _\\    \\/    |_____||_____||_____|" + "\n";

    String result900 = 
        "  _____  __  __ "  + "\n" +
        " / ____||  \\/  |" + "\n" +
        "| |     | \\  / |" + "\n" +
        "| |     | |\\/| |" + "\n" +
        "| |____ | |  | |"  + "\n" +
        " \\_____||_|  |_|" + "\n";
    
    // Act
    String value1 = RomanPrinter.print(1);
    String value3 = RomanPrinter.print(3);
    String value4 = RomanPrinter.print(4);
    String value6 = RomanPrinter.print(6);
    String value9 = RomanPrinter.print(9);
    String value20 = RomanPrinter.print(20);
    String value39 = RomanPrinter.print(39);
    String value99 = RomanPrinter.print(99);
    String value488 = RomanPrinter.print(488);
    String value900 = RomanPrinter.print(900);

    // Assert
    assertEquals(value1, result1);
    assertEquals(value3, result3);
    assertEquals(value4, result4);
    assertEquals(value6, result6);
    assertEquals(value9, result9);
    assertEquals(value20, result20);
    assertEquals(value39, result39);
    assertEquals(value99, result99);
    assertEquals(value488, result488);
    assertEquals(value900, result900);
  }
}