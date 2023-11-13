package level2.level2_15; // 나머지가 1이 되는 수 찾기

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        List<Integer> numList = new ArrayList<>();
        int x = 0;
        int xMin = n;

        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                x = i;
                numList.add(x);
            }
        }
        for (int num : numList) {
            if (num < xMin) {
                xMin = num;
            }
        }
        return xMin;
    }
}
