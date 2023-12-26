package level4.level4_76; // JadenCase 문자열 만들기

class Solution {
  public String solution(String s) {
    String sLowerCase = s.toLowerCase();
    StringBuilder sb = new StringBuilder();
    boolean isFirstLetter = true;

    String[] words = sLowerCase.split("");
    for (String word : words) {
      sb.append(isFirstLetter ? word.toUpperCase() : word);
      isFirstLetter = word.equals(" ");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String s = "3people unFollowed me";
    Solution solution = new Solution();
    String answer = solution.solution(s);
    System.out.println(answer);
  }
}