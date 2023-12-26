package level4.level4_71; // 개인정보 수집 유효기간

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public int[] solution(String today, String[] terms, String[] privacies) {
    Map<String, Integer> termMap = new HashMap<>();
    List<Integer> answerList = new ArrayList<>();

    String[] todayArray = today.split("\\.");
    int todayYear = Integer.parseInt(todayArray[0]);
    int todayMonth = Integer.parseInt(todayArray[1]);
    int todayDay = Integer.parseInt(todayArray[2]);

    for (int i = 0; i < terms.length; i++) {
      String[] termArray = terms[i].split(" ");
      termMap.put(termArray[0], Integer.valueOf(termArray[1])); // terms 맵
    }

    for (int i = 0; i < privacies.length; i++) {
      String[] privacyArray = privacies[i].split(" ");
      String[] privacyDateArray = privacyArray[0].split("\\.");
      int privacyYear = Integer.parseInt(privacyDateArray[0]);
      int privacyMonth = Integer.parseInt(privacyDateArray[1]);
      int privacyDay = Integer.parseInt(privacyDateArray[2]);

      int newPrivacyYear = privacyYear;
      int newPrivacyMonth = privacyMonth;
      boolean isExpired = true;

      for (String key : termMap.keySet()) {
        if (key.equals(privacyArray[1])) {
          newPrivacyMonth += termMap.get(key);
          while (newPrivacyMonth > 12) {
            newPrivacyMonth -= 12;
            newPrivacyYear += 1;
          }

          if (todayYear < newPrivacyYear || (todayYear == newPrivacyYear && todayMonth < newPrivacyMonth) ||
              (todayYear == newPrivacyYear && todayMonth == newPrivacyMonth && todayDay < privacyDay)) {
            isExpired = false; // 만료되지 않음
          } else {
            isExpired = true; // 만료됨
          }
        }
      }
      if (isExpired) {
        answerList.add(i + 1);
      }
    }
    return answerList.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    String today = "2020.04.16";
    String[] terms = {"A 36", "S 4"};
    String[] privacies = {"2017.04.17 A", "2014.04.16 S"};

    Solution solution = new Solution();
    int[] answer = solution.solution(today, terms, privacies);
    for (int i : answer) {
      System.out.println(i);
    }
  }
}
