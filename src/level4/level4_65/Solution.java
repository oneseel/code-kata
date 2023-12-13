package level4.level4_65; // 문자열 자르기

import java.util.ArrayList;
import java.util.List;

class Solution {

  public int solution(String s) {
    int xCount = 1; // 첫 글자 x와 같은 숫자의 개수
    int nonXCount = 0; // x와 다른 숫자의 개수
    List<String> answer = new ArrayList<>(); // 잘린 문자열 리스트

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(0) != s.charAt(i)) {
        nonXCount++;
      } else {
        xCount++;
      }

      if (xCount == nonXCount) {
        String substring = s.substring(0, xCount + nonXCount);
        answer.add(substring);
        s = s.substring(xCount + nonXCount);
        xCount = 1;
        nonXCount = 0;
        i = 0;
      }
    }
    if (!s.isEmpty()) {
      answer.add(s);
    }

    return answer.size();
  }

  public static class Main {
    public static void main(String[] args) {
      Solution solution = new Solution();
      String input = "abracadabra";
      int result = solution.solution(input);
      System.out.println(result);
    }
  }
}