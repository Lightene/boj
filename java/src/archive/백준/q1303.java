package archive.백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class q1303 {

    static int w, b, n = 0;

    // 현재 위치에서 4방면을 확인하기 위한 도구
    static int[] vectorX = {0, 0, -1, 1};
    static int[] vectorY = {-1, 1, 0, 0};

    // height, width 크기에 따른 맵
    static String[][] map;

    // 방문 여부를 체크하기 위한 맵
    static boolean[][] history;

    public static void dfs(int x, int y, String current) {
        for (int i = 0; i < 4; i++) {
            int currentX = x + vectorX[i];
            int currentY = y + vectorY[i];

            if(currentX < 0 || currentY < 0 || currentY >= map.length || currentX >= map[0].length)
                continue;

            if (map[currentY][currentX].equals(current) // 현재 문자와 같은가
                    && !history[currentY][currentX] // 방문하지 않은 곳인가
            ) {
                n++;
                history[y][x] = true;
                dfs(currentX, currentY, current);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int width = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        map = new String[height][width];
        history = new boolean[height][width];

        // map 초기화
        for (int i = 0; i < height; i++) {
            map[i] = br.readLine().split("");
        }

        // DFS
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                n = 0;
                dfs(x, y, map[y][x]);

                if (map[y][x].equals("W")) {
                    w += n * n;
                } else {
                    b += n * n;
                }
            }
        }


        System.out.println(w + " " + b);

    }
}
