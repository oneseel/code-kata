package level2.level2_16; // x만큼 간격이 있는 n개의 숫자

class Solution {
    public long[] solution(int x, int n) {
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = x + (long) x * i;
        }
        return numbers;
    }
}