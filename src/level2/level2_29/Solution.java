package level2.level2_29; // 제일 작은 수 제거하기

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> numbers = new ArrayList<>();
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int min = arr[0];

        for (int n : arr) {
            numbers.add(n);
           if (n < min) {
               min = n;
           }
        }
        numbers.remove(Integer.valueOf(min));

        int[] answer = new int[numbers.size()];

        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }

        return answer;
    }
}