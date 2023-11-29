package level3.level3_54;

class Solution {
  public String solution(int a, int b) {
    String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    int init = 5; // 금요일
    int[] dates = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    int date = 0;
    String day = "";

    for (int i = 0; i < a; i++) {
      date += dates[i];
    }
    date += init + b - 1;
    day = days[date % 7];

    return day;
  }
}