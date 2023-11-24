package level3.level3_44; // 최소 직사각형

class Solution {
  public int solution(int[][] sizes) {
    int maxW = 0;
    int maxH = 0;

    for (int i = 0; i < sizes.length; i++) {
      int width = sizes[i][0];
      int height = sizes[i][1];

      maxW = Math.max(maxW, Math.max(width, height));
      maxH = Math.max(maxH, Math.min(width, height));
    }

    return maxW * maxH;
  }
}