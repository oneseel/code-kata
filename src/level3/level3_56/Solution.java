package level3.level3_56;

import java.util.Arrays;

class Solution {

  public int solution(int k, int m, int[] score) {
    int answer = 0;
    int count = score.length; // 사과의 개수

    Arrays.sort(score); // 사과 정렬

    int idx = count - m; // 가장 비싼 사과박스의 최저점 사과
    while (idx >= 0) {
      answer += score[idx] * m;
      idx -= m;
    }

    return answer;
  }
}