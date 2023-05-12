package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

  @Test(expected = IllegalArgumentException.class)
  public void testUnderflow() {
    // Act
    IntegerToRoman.converter(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testOverflow() {
    // Act
    IntegerToRoman.converter(IntegerToRoman.max + 1);
  }

  @Test
  public void testFirst3Number() {
    // Arrange
    String res_1;
    String res_2;
    String res_3;

    // Act
    res_1 = IntegerToRoman.converter(1);
    res_2 = IntegerToRoman.converter(2);
    res_3 = IntegerToRoman.converter(3);

    // Assert
    assertEquals(res_1, "I");
    assertEquals(res_2, "II");
    assertEquals(res_3, "III");
  }
}