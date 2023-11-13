package level2.level2_20; // 정수 내림차순으로 배치하기

import java.util.*;

class Solution {
    public long solution(long n) {
        List<Long> numbers = new ArrayList<>();

        while (n > 0) {
            numbers.add(n % 10);
            n /= 10;
        }

        Collections.sort(numbers, Collections.reverseOrder());

        long answer = 0;
        for (int i = 0; i < numbers.size(); i++) {
            answer = answer * 10 + numbers.get(i);
        }

        return answer;
    }
}