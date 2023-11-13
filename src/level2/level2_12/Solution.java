package level2.level2_12; // 평균 구하기

class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }
}