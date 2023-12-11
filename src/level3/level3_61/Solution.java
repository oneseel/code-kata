package level3.level3_61; // 로또의 최고 순위와 최저 순위

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

  public int[] solution(int[] lottos, int[] win_nums) {
    Arrays.sort(lottos); // 내 로또 정렬
    Arrays.sort(win_nums); // 당첨번호 정렬
    int count = 0; // 맞춘 개수

    List<Integer> lottosList = new ArrayList<>();
    List<Integer> win_numsList = new ArrayList<>();

    for (int i = 0; i < 6; i++) {
      lottosList.add(lottos[i]);
      win_numsList.add(win_nums[i]);
    }

    // 내 로또번호와 당첨번호를 비교
    for (int i = 0; i < 6; i++) {
      if (lottosList.contains(win_numsList.get(i))) {
        count++;
      }
    }

    // 낙서되지 않은 로또 번호 삭제
    lottosList.removeIf(number -> number != 0);

    int zero = lottosList.size(); // 낙서된 번호의 수
    int maxCount = count + zero; // 맞출 수 있는 최대

    int rank = getRank(count);
    int maxRank = getRank(maxCount);

    return new int[]{maxRank, rank};
  }

  // 맞춘 개수를 이용해 순위를 구하는 메소드
  public int getRank(int count) {
    int rank = 6;
    if (count == 6) rank = 1;
    else if (count == 5) rank = 2;
    else if (count == 4) rank = 3;
    else if (count == 3) rank = 4;
    else if (count == 2) rank = 5;
    return rank;
  }
}