package level3.level3_51; // 푸드 파이트 대회

class Solution {
  public String solution(int[] food) {
    StringBuilder sb = new StringBuilder();
    for(int i = 1; i < food.length; i++) {
      sb.append(String.valueOf(i).repeat(food[i] / 2));
    }

    sb.append(0);

    for(int i = food.length - 1; i > 0; i--) {
      sb.append(String.valueOf(i).repeat(food[i] / 2));
    }
    return sb.toString();
  }
}