package level3.level3_59; // 덧칠하기

class Solution {
  public int solution(int n, int m, int[] section) {
    int init = section[0]; // 페인트칠 해야 하는 첫 부분
    int count = 1; // 벽에 칠해야 하는 횟수

    for (int i = 1; i < section.length ; i++) {
      if (init + m - 1 < section[i]) {
        count++;
        init = section[i];
      }
    }
    return count;
  }
}
