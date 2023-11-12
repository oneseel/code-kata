package level2.level2_9; // 정수 제곱근 판별

class Solution {
    public long solution(long n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (Math.pow(i, 2) == n) {
                return (long) Math.pow(i + 1, 2);
            }
        }
        return -1;
    }
}