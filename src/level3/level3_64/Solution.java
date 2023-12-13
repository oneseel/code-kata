package level3.level3_64; // 체육복

/*
n = 전체 학생의 수
lost =  체육복을 도난당한 학생들의 번호가 담긴 배열
reserve = 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
*/

import java.util.Arrays;

class Solution {

  public static int solution(int n, int[] lost, int[] reserve) {
    int count = n - lost.length; // 체육복 있는 학생의 수
    Arrays.sort(lost);
    Arrays.sort(reserve);

    // 여벌 체육복을 가진 학생 중에 도난당한 학생에게 빌려줄 수 있는 경우
    for (int i = 0; i < lost.length; i++) {
      for (int j = 0; j < reserve.length; j++) {

        // 여벌 체육복을 가져온 학생이 도난 당한 경우
        if (lost[i] == reserve[j]) {
          count++;
          lost[i] = -1; // 빌려준 학생 제외
          reserve[j] = -1; // 도난당한 학생 제외
          break;
        }
      }
    }

      // 여벌 체육복을 가진 학생 중에 도난당한 학생에게 빌려줄 수 있는 경우
      for (int i = 0; i < lost.length; i++) {
        for (int j = 0; j < reserve.length; j++) {

        // 여벌 체육복을 가진 학생이 도난당한 학생에게 빌려줄 수 있는 경우
        if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
          count++;
          reserve[j] = -1;
          break;
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    int n = 5;
    int[] lost = {2, 4};
    int[] reserve = {3};
    System.out.println(solution(n, lost, reserve));
  }
}