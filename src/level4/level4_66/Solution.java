package level4.level4_66; // 대충 만든 자판

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] solution(String[] keymap, String[] targets) {

    int[] answer = new int[targets.length];
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < keymap.length; i++) {
      for (int j = 0; j < keymap[i].length(); j++) {
        char current = keymap[i].charAt(j); // keymap에 i번째 위치한 값의 j번째 글자

        if (map.containsKey(current)) {
          int idx = map.get(current);
          map.put(current, Math.min(idx, j + 1));
        } else {
          map.put(current, j + 1);
        }
      }
    }

    for (int i = 0; i < targets.length; i++) {
      String target = targets[i];
      int count = 0;
      boolean b = true;

      for (char c : target.toCharArray()) {
        if (map.containsKey(c)) {
          count += map.get(c);
        } else {
          b = false;
          break;
        }
      }
      answer[i] = b == false ? -1 : count;
    }
    return answer;
  }

  public static void main(String[] args) {
    String[] keymap = {"ABACD", "BCEFD"};
    String[] targets = {"ABCD", "AABB"};

    Solution solution = new Solution();
    int[] answer = solution.solution(keymap, targets);

    for (int i = 0; i < answer.length; i++) {
      System.out.println(answer[i]);
    }
  }
}
