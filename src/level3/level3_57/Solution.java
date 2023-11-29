package level3.level3_57;

import java.util.ArrayList;
import java.util.List;

class Solution {

  public int[] solution(int[] answers) {
    // 수포자가 맞춘 개수
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;

    int[] supoja1 = new int[answers.length];
    int[] supoja2 = new int[answers.length];
    int[] supoja3 = new int[answers.length];

    // 수포자 패턴
    int[] supoja1Patten = {1, 2, 3, 4, 5};
    int[] supoja2Patten = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] supoja3Patten = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    // 수포자의 답지
    for (int i = 0; i < answers.length; i++) {
      supoja1[i] = supoja1Patten[i % supoja1Patten.length];
      supoja2[i] = supoja2Patten[i % supoja2Patten.length];
      supoja3[i] = supoja3Patten[i % supoja3Patten.length];
    }

    // 수포자가 맞춘 개수 구하기
    for (int i = 0; i < answers.length; i++) {
      count1 = supoja1[i] == answers[i] ? count1 + 1 : count1;
      count2 = supoja2[i] == answers[i] ? count2 + 1 : count2;
      count3 = supoja3[i] == answers[i] ? count3 + 1 : count3;
    }

    // 가장 많이 맞춘 수포자 구하기
    int maxCount = Math.max(Math.max(count1, count2), count3);

    List<Integer> result = new ArrayList<>();

    if (maxCount == count1) {
      result.add(1);
    }
    if (maxCount == count2) {
      result.add(2);
    }
    if (maxCount == count3) {
      result.add(3);
    }

    int[] resultArray = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      resultArray[i] = result.get(i);
    }

    return resultArray;
  }
}