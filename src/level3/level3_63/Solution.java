package level3.level3_63; // 숫자 짝꿍

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

  public String solution(String X, String Y) {
    Map<String, Integer> mapX = new HashMap<>();
    Map<String, Integer> mapY = new HashMap<>();
    List<String> list = new ArrayList<>();

    for (String key : X.split("")) {
      mapX.put(key, mapX.getOrDefault(key, 0) + 1);
    }
    for (String key : Y.split("")) {
      mapY.put(key, mapY.getOrDefault(key, 0) + 1);
    }

    for (String key : mapX.keySet()) {
      if (mapY.containsKey(key)) {
        int dup = mapX.get(key) - mapY.get(key);
        if (dup >= 0) {
          for (int i = 0; i < mapY.get(key); i++) {
            list.add(key);
          }
        } else {
          for (int i = 0; i < mapX.get(key); i++) {
            list.add(key);
          }
        }
      }
    }

    if (list.isEmpty()) {
      return "-1";
    }

    list.sort((s1, s2) -> s2.compareTo(s1)); // 리스트에 있는 값을 내림차순으로 정렬
    String result = String.join("", list);
    if (result.matches("^[0]+$")) {
      return "0";
    } else {
      return result;
    }
  }
}



