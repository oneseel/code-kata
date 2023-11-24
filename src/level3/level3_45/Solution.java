package level3.level3_45;

class Solution {

  public String solution(String s, int n) {
    StringBuilder sb = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isLetter(c)) {
        char base = Character.isUpperCase(c) ? 'A' : 'a';
        char ch = (char) ((c - base + n) % 26 + base);
        sb.append(ch);
      } else {
        sb.append(c);
      }
    }

    return sb.toString();
  }
}