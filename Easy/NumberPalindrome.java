package Easy;

/**
 * Given an integer x, return true if x is palindrome integer. Console output:
     * false
     * true
     * true
 */
public class NumberPalindrome {

  public static void main(String[] args) {
    System.out.println(NumberPalindrome.isPalindrome(-121));
    System.out.println(NumberPalindrome.isPalindrome(121));
    System.out.println(NumberPalindrome.isPalindrome(9889));
  }
  public static boolean isPalindrome(int x) {
    String s = String.valueOf(x);
    char[] chArr = s.toCharArray();
    int firstPointer = 0;
    int lastPointer = chArr.length -1;
    while(firstPointer < lastPointer) {
      if(chArr[firstPointer] != chArr[lastPointer])
        return false;

      lastPointer--;
      firstPointer++;
    }
    return true;
  }
}
