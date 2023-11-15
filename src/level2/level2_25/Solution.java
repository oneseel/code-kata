package level2.level2_25; // 나누어 떨어지는 숫자 배열

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> numbers = new ArrayList<>();

        for (int n : arr) {
            if (n % divisor == 0) {
                numbers.add(n);
            }
        }

        if (numbers.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(numbers);

        int[] answer = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            answer[i] = numbers.get(i);
        }
        return answer;
    }
}