package level3.level3_46;

import java.util.HashMap;
import java.util.Map;

class Solution {

  public static int solution(String s) {
    Map<String, String> numberMap = new HashMap<>();
    numberMap.put("zero", "0");
    numberMap.put("one", "1");
    numberMap.put("two", "2");
    numberMap.put("three", "3");
    numberMap.put("four", "4");
    numberMap.put("five", "5");
    numberMap.put("six", "6");
    numberMap.put("seven", "7");
    numberMap.put("eight", "8");
    numberMap.put("nine", "9");

    StringBuilder sb = new StringBuilder();
    StringBuilder answer = new StringBuilder();

    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        answer.append(c);
      } else {
        sb.append(c);
        if (numberMap.containsKey(sb.toString())) {
          answer.append(numberMap.get(sb.toString()));
          sb = new StringBuilder();
        }
      }
    }

    return Integer.parseInt(answer.toString());
  }
}