package level2.level2_28; // 없는 숫자 더하기

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean[] found = new boolean[10];

        for (int number : numbers) {
           found[number] = true;
            }

        for (int i = 0; i <= 9; i++) {
            if (!found[i]) {
                answer += i;
            }
        }

        return answer;
    }
}

