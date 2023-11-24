package level3.level3_43; // 크기가 작은 부분 문자열

  import java.util.ArrayList;
  import java.util.List;

  class Solution {

    public int solution(String t, String p) {
      int length = p.length();
      char[] array = t.toCharArray();
      List<String> stringArray = new ArrayList<>();

      for (int i = 0; i <= array.length - length; i++) {
        StringBuilder sb = new StringBuilder();
        for (int j = i; j < i + length; j++) {
          sb.append(array[j]);
        }
        stringArray.add(sb.toString());
      }

      int count = 0;
      for (String s : stringArray) {
        if (s.compareTo(p) <= 0) {
          count++;
        }
      }
      return count;
    }
  }