package level3.level3_53; // 명예의 전당 (1)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
  public int[] solution(int k, int[] score) {
    int[] answer = new int[score.length];
    List<Integer> scoreList = new ArrayList<>();

    for (int i = 0; i < score.length; i++) {
      scoreList.add(score[i]);

      if (scoreList.size() > k) {
        scoreList.remove(Collections.min(scoreList));
      }
      answer[i] = Collections.min(scoreList);
    }
  return answer;
  }
}
