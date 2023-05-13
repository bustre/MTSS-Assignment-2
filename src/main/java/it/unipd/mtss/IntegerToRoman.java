////////////////////////////////////////////////////////////////////
// Alessandro Bustreo 2042383
// Lorenzo Rosson 2042349
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.TreeMap;

public class IntegerToRoman {

  public final static int min = 1;
  public final static int max = 50;

  private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

  static {
    map.put(50, "L");
    map.put(40, "XL");
    map.put(10, "X");
    map.put(9, "IX");
    map.put(5, "V");
    map.put(4, "IV");
    map.put(1, "I");
  }

  public static String converter(int number) {
    if (number < min || number > max) {
      throw new IllegalArgumentException();
    }

    int floorNum = map.floorKey(number);
    if (number == floorNum) {
      return map.get(number);
    }
    return map.get(floorNum) + converter(number - floorNum);
  }
}