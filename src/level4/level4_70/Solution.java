package level4.level4_70; // 바탕화면 정리

// S(lux, luy) -> E(rdx, rdy)

class Solution {
  public int[] solution(String[] wallpaper) {
    // 각 점 위치의 초기값
    int lux = Integer.MAX_VALUE;
    int luy = Integer.MAX_VALUE;
    int rdx = 0;
    int rdy = 0;

    for (int i = 0; i < wallpaper.length; i++) {
      for (int j = 0; j < wallpaper[0].length(); j++) {
        if (wallpaper[i].charAt(j) == '#') {
          lux = Math.min(lux, i);
          luy = Math.min(luy, j);
          rdx = Math.max(rdx, i);
          rdy = Math.max(rdy, j);
        }
      }
    }
    return new int[]{lux, luy, rdx + 1, rdy + 1};
  }

  public static void main(String[] args) {
    String[] wallpaper = {".#...", "..#..", "...#."};
    Solution solution = new Solution();
    int[] answer = solution.solution(wallpaper);
    for (int i : answer) {
      System.out.println(i); // 0, 1, 3, 4
    }
  }
}