package level2.level2_35; // 부족한 금액 계산하기

class Solution {
    public long solution(int price, int money, int count) {
        long result = ((price + (long) price * count) * count) / 2;

        return money > result ? 0 : result - money;
    }
}