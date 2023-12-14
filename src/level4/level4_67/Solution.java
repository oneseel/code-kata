package level4.level4_67; // 둘만의 암호

import java.util.ArrayList;
import java.util.List;

class Solution {

  public String solution(String s, String skip, int index) {
    List<Character> alphabet = new ArrayList<>();

    // skip의 값을 제외한 새로운 알파벳
    for (char c = 'a'; c <= 'z'; c++) {
      if (!skip.contains(String.valueOf(c))) {
        alphabet.add(c);
      }
    }

    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      int originalIdx = alphabet.indexOf(c);
      int newIdx = (originalIdx + index) % alphabet.size();
      sb.append(alphabet.get(newIdx));
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    String s = "aukks";
    String skip = "wbqd";
    int index = 5;
    Solution solution = new Solution();
    String answer = solution.solution(s, skip, index);
    System.out.println(answer);
  }
}
