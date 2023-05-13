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


  @Test
  public void testFirst6Number() {
    // Arrange
    String res_4;
    String res_6;

    // Act
    res_4 = IntegerToRoman.converter(4);
    res_6 = IntegerToRoman.converter(6);

    // Assert
    assertEquals(res_4, "IV");
    assertEquals(res_6, "VI");
  }

  @Test
  public void testFirst10Number() {
    // Arrange
    String res_8;
    String res_9;
    String res_10;

    // Act
    res_8 = IntegerToRoman.converter(8);
    res_9 = IntegerToRoman.converter(9);
    res_10 = IntegerToRoman.converter(10);
    
    // Assert
    assertEquals(res_8, "VIII");
    assertEquals(res_9, "IX");

    assertEquals(res_10, "X");
  }

  @Test
  public void testFirst20Number() {
    // Arrange
    String res_19;
    String res_20;

    // Act
    res_19= IntegerToRoman.converter(19);
    res_20 = IntegerToRoman.converter(20);
    
    // Assert
    assertEquals(res_19, "XIX");
    assertEquals(res_20, "XX");
  }

  @Test
  public void testFirst50Number() {
    // Arrange
    String res_50;
    String res_40;
    String res_39;

    // Act
    res_50 = IntegerToRoman.converter(50);
    res_40 = IntegerToRoman.converter(40);
    res_39 = IntegerToRoman.converter(39);
    
    // Assert
    assertEquals(res_50, "L");
    assertEquals(res_40, "XL");
    assertEquals(res_39,"XXXIX");
  }
}