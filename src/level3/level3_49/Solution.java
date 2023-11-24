package level3.level3_49; // 두 개 뽑아서 더하기

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
  public static int[] solution(int[] numbers) {
    Set<Integer> numbersSet = new HashSet<>();

    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        numbersSet.add(numbers[i] + numbers[j]);
      }
    }

    int[] array = new int[numbersSet.size()];
    int index = 0;
    for (int num : numbersSet) {
      array[index++] = num;
    }
    Arrays.sort(array);

    return array;
  }
}
