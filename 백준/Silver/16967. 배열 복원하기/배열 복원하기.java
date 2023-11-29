import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        int[][] B = new int[H+X][W+Y];

        for(int i = 0; i < B.length; i++){
            B[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = X; i < H; i++) {
            for (int j = Y; j < W; j++) {
                B[i][j] -= B[i - X][j - Y];
            }
        }

        for(int i = 0; i < H; i++){
            System.out.println(Arrays.toString(Arrays.copyOfRange(B[i], 0, W)).replaceAll("[,\\[\\]]", ""));
        }
    }
}