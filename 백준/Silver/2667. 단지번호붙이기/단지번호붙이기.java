import java.io.*;
import java.util.*;

class Main {

    static int[][] table;

    static int tableSize;
    static boolean[][] check;
    static int result = 0;
    static List<Integer> resultArray = new ArrayList<>();

    public static void group(int initialY, int initialX) {
        check[initialY][initialX] = true;
        ++result;

        int[] y = {1, 0, -1, 0};
        int[] x = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            if (0 <= initialX + x[i] && tableSize > initialX + x[i] &&
                0 <= initialY + y[i] && tableSize > initialY + y[i]&&
                    table[initialY + y[i]][initialX + x[i]] == 1 && !check[initialY + y[i]][initialX + x[i]]) {
                group(initialY + y[i], initialX + x[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        tableSize = Integer.parseInt(st.nextToken());
        table = new int[tableSize][tableSize];
        check = new boolean[tableSize][tableSize];


        for (int i = 0; i < tableSize; i++) {
            table[i] = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < tableSize; i++) {
            for (int j = 0; j < tableSize; j++) {
                if (table[i][j] == 1 && !check[i][j]) {
                    group(i, j);
                    resultArray.add(result);
                    result = 0;
                }
            }
        }
        System.out.println(resultArray.size());
        Collections.sort(resultArray);
        for (int i : resultArray) {
            System.out.println(i);
        }

    }
}