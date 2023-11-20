package level2.level2_39; // 최대공약수와 최소공배수

class Solution {
    public int[] solution(int n, int m) {
        return new int[] {gcd(n, m), n * m / gcd(n, m)};
    }
    public int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}