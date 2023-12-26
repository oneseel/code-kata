package level4.level4_72; // 달라기 경주

import java.util.HashMap;
import java.util.Map;

class Solution {
  public String[] solution(String[] players, String[] callings) {
    Map<String, Integer> rankingMap = new HashMap<>();

    // (player, 현재순위)로 된 맵
    for (int i = 0; i < players.length; i++) {
      rankingMap.put(players[i], i);
    }

    for (String player : callings) {
      int currentRanking = rankingMap.get(player); //  현재 플레이어의 순위
      String frontPlayer = players[currentRanking - 1]; // 현재 플레이어 앞에 있는 선수

      // 위치 바꾸기
     rankingMap.put(player, currentRanking - 1);
     rankingMap.put(frontPlayer, currentRanking);

     players[currentRanking] = players[currentRanking - 1];
     players[currentRanking - 1] = player;
    }

    return players;
  }

  public static void main(String[] args) {
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};
    Solution solution = new Solution();
    String[] answer = solution.solution(players, callings);
    for (String s : answer) {
      System.out.println(s);
    }
  }
}