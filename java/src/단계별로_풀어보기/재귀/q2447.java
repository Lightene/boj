package 단계별로_풀어보기.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2447 {

    static char[][] star;

    static public void starPrint(int x, int y, int N){

        if(N == 1){
            star[x][y] = '*';
            return ;
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(i == 1 && j == 1){
                    ;
                }else{
                    starPrint(x+(j*N/3), y+(i*N/3), N/3);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        star = new char[N][N];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++){
                star[i][j] = ' ';
            }
        }

        starPrint(0, 0, N);

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
                System.out.print(star[i][j]);
            System.out.println();
        }

    }
}
