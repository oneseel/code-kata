package level4.level4_74; // 신고 결과 받기

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {

  public int[] solution(String[] id_list, String[] report, int k) {
    Map<String, Set<String>> reportMap = new HashMap<>();
    Map<String, Integer> reportCountMap = new HashMap<>();
    Set<String> reportSet = new HashSet<>(Arrays.asList(report));

    for (String s : reportSet) {
      String[] temp = s.split(" ");
      String reporter = temp[0]; // 신고한 사람
      String reported = temp[1]; // 신고 당한 사람

      // putIfAbsent : 맵에 주어진 키가 존재하지 않을 때에만 값을 추가, reporter가 이미 맵에 존재할 경우 새로운 값을 추가하지 않음
      // reporter가 맵에 없는 경우, 새로운 HashSet가 생성되고 이 HashSet에 reported의 값이 추가된다.
      reportMap.putIfAbsent(reporter, new HashSet<String>());
      reportMap.get(reporter).add(reported);
      reportCountMap.put(reported, reportCountMap.getOrDefault(reported, 0) + 1);
    }

    int[] answer = new int[id_list.length];

    for (String reported : reportCountMap.keySet()) { // 신고 당한 사람
      int reportedCount = reportCountMap.get(reported);
      if (reportedCount >= k) { // 신고를 k번 이상으로 당했는지 확인
        for (int i = 0; i < id_list.length; i++) {
          if (reportMap.get(id_list[i]) == null) {
            answer[i] = 0;
          } else if (reportMap.get(id_list[i]).contains(reported)) {
            answer[i]++;
          }
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    int k = 2;

    Solution solution = new Solution();
    int[] answer = solution.solution(id_list, report, k);
    for (int i = 0; i < answer.length; i++) {
      System.out.println(answer[i]);
    }
  }
}