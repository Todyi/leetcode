package easy._13_roman_to_integer;

/**
 * @program: leetcode
 * @description: 13.roman-to-integer
 * @author: hdy
 * @create: 2019-04-23
 **/

public class RomanToInt {

  enum Roman {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
    private int value;

    Roman(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }

    public static Roman getRoman(String c) {
      switch (c) {
        case "I":
          return Roman.I;
        case "V":
          return Roman.V;
        case "X":
          return Roman.X;
        case "L":
          return Roman.L;
        case "C":
          return Roman.C;
        case "D":
          return Roman.D;
        case "M":
          return Roman.M;
      }
      return null;
    }
  }

  public static int romanToInt(String s) {
    int result = 0;
    char[] array = s.toCharArray();
    for (int i = 0; i < array.length; i++) {
      Roman romanI = Roman.getRoman(String.valueOf(array[i]));
      if (i != array.length - 1) {
        Roman romanJ = Roman.getRoman(String.valueOf(array[i + 1]));
        if (romanI.ordinal() >= romanJ.ordinal()) {
          result += romanI.getValue();
        } else {
          result -= romanI.getValue();
        }
      } else {
        result += romanI.getValue();
      }
    }
    return result;
  }

  public static int anotherRomanToInt(String s) {
    char[] input = s.toCharArray();
    int result = 0;
    char prechar = input[0];
    for (char ch : input) {
      switch (ch) {
        default:

        case 'I':
          result = result + 1;
          break;
        case 'V':
          if (prechar == 'I') {
            result = result - 1 + (5 - 1);
          } else {
            result = result + 5;
          }
          break;
        case 'X':
          if (prechar == 'I') {
            result = result - 1 + (10 - 1);
          } else {
            result = result + 10;
          }
          break;
        case 'L':
          if (prechar == 'X') {
            result = result - 10 + (50 - 10);
          } else {
            result = result + 50;
          }
          break;
        case 'C':
          if (prechar == 'X') {
            result = result - 10 + (100 - 10);
          } else {
            result = result + 100;
          }
          break;
        case 'D':
          if (prechar == 'C') {
            result = result - 100 + (500 - 100);
          } else {
            result = result + 500;
          }
          break;
        case 'M':
          if (prechar == 'C') {
            result = result - 100 + (1000 - 100);
          } else {
            result = result + 1000;
          }
          break;
      }
      prechar = ch;
    }

    return result;
  }
}
