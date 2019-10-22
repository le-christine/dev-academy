class Main {
  public static void main(String[] args) {
    isPalindrome("civic");
  }

  public static boolean isPalindrome(String str) {
    // base case
    if (str.length() <= 1) {
      return false;
    } else {
      char first = str.charAt(0);
      char last = str.charAt(str.length() - 1);

      if (first != last) {
        return false;
      } else {
        String middle = (str.substring(1, str.length()-1));
        return isPalindrome(middle);
      }
    }
  }
}
