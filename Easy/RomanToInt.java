package Easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a roman numeral, convert it to an integer. Console output is below:
 * Question Link: https://leetcode.com/problems/roman-to-integer/
     * 1994
     * 58
     * 3
 *
 */
public class RomanToInt {

  public static void main(String[] args) {
    System.out.println(RomanToInt.romanToInt("MCMXCIV"));
    System.out.println(RomanToInt.romanToInt("LVIII"));
    System.out.println(RomanToInt.romanToInt("III"));
  }
  public static int romanToInt(String s) {

    Map<Character, Integer> romanMap = createMap();
    int resultant = 0;
    char[] chArr = s.toCharArray();
    for(int i=chArr.length-1;i>=0;i--) {
      int presentValue = romanMap.get(chArr[i]);
      int presentPreviousValue = 0;
      int finalValue;

      if(i!=0)
        presentPreviousValue = romanMap.get(chArr[i-1]);

      if(presentPreviousValue !=0 && presentPreviousValue<presentValue) {
        finalValue = presentValue-presentPreviousValue;
        i--;
      } else {
        finalValue = presentValue;
      }
      resultant+=finalValue;
    }
    return resultant;
  }

  private static Map<Character, Integer> createMap() {
    Map<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);

    return romanMap;

  }
}
