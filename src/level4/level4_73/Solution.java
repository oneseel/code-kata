package level4.level4_73; // 공원 산책

class Solution {

  public int[] solution(String[] park, String[] routes) {
    int x = -1; // 초기값
    int y = -1; // 초기값
    int height = park.length; // 공원 세로길이
    int width = park[0].length(); // 공원 가로길이

    // 시작점 찾기
    for (int i = 0; i < park.length; i++) {
      if (park[i].indexOf('S') != -1) {
        x = park[i].indexOf('S');
        y = i;
        break;
      }
    }

    // 이동하기
    for (int i = 0; i < routes.length; i++) {
      String[] splitRoute = routes[i].split(" "); // 방향과 거리 구분
      String vector = splitRoute[0]; // 방향
      int distance = Integer.parseInt(splitRoute[1]); // 거리
      // 현재 위치
      int currentX = x;
      int currentY = y;
      boolean flag = false;

      // 동쪽으로 이동 (E)
      if (vector.equals("E")) {
        flag = true;
        for (int j = 1; j <= distance; j++) {
          currentX++;
          if (currentX >= width) { // 공원을 벗어남
            flag = false;
            break;
          } else if (park[currentY].charAt(currentX) == 'X') { // 장애물을 만난 경우
            flag = false;
            break;
          }
        }
        if (flag) {
          x = currentX;
        }

        // 서쪽으로 이동 (W)
      } else if (vector.equals("W")) {
        flag = true;
        for (int j = 1; j <= distance; j++) {
          currentX--;
          if (currentX < 0) { // 공원을 벗어남
            flag = false;
            break;
          } else if (park[currentY].charAt(currentX) == 'X') { // 장애물을 만난 경우
            flag = false;
            break;
          }
        }
        if (flag) {
          x = currentX;
        }

        // 남쪽으로 이동 (S)
      } else if (vector.equals("S")) {
        flag = true;
        for (int j = 1; j <= distance; j++) {
          currentY++;
          if (currentY > height) { // 공원을 벗어남
            flag = false;
            break;
          } else if (park[currentY].charAt(currentX) == 'X') { // 장애물을 만난 경우
            flag = false;
            break;
          }
        }
        if (flag) {
          y = currentY;
        }

        // 북쪽으로 이동 (N)
      } else if (vector.equals("N")) {
        flag = true;
        for (int j = 1; j <= distance; j++) {
          currentY--;
          if (currentY < 0) { // 공원을 벗어남
            flag = false;
            break;
          }
          if (park[currentY].charAt(currentX) == 'X') { // 장애물을 만난 경우
            flag = false;
            break;
          }
        }
        if (flag) {
          y = currentY;
        }
      }
    }
    return new int[]{y, x};
  }

  public static void main(String[] args) {
    String[] park = {"OSO", "OOO", "OXO", "OOO"};
    String[] routes = {"E 2", "S 3", "W 1"};
    Solution solution = new Solution();
    int[] answer = solution.solution(park, routes);
    System.out.println(answer[0] + ", " + answer[1]);
  }
}