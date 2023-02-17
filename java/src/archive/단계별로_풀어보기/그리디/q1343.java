package archive.단계별로_풀어보기.그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class q1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String board = bf.readLine();

        StringBuilder sb = new StringBuilder("");

        ArrayList<Integer> end = new ArrayList();

        int err = 0;

        int start = 0;
        int endcnt = 0;

        for(int i = 0; i < board.length(); i++){
            if(board.charAt(i) == '.') {
                end.add(i);
            }
        }

        int cu = 0;

        for(int i=0; i<end.size(); i++){
            cu = end.get(i) - start ;

            int BB = cu / 2;
            int AAAA = BB / 2;
            BB -= AAAA * 2;

            if(cu%2 != 0){
                err -= 1;
                System.out.println("1");
                break;
            }

            for(int j=0; j < AAAA; j++)
            {
                sb.append("AAAA");
            }
            for(int j=0; j < BB; j++)
            {
                sb.append("BB");
            }

            start = end.get(i) + 1;
            sb.append(".");
        }

        if(end.size() != start){
            cu = board.length()  - start ;

            int BB = cu / 2;
            int AAAA = BB / 2;
            BB -= AAAA * 2;

            if(cu%2 != 0){
                err -= 1;
                System.out.println("2");
            }

            for(int j=0; j < AAAA; j++)
            {
                sb.append("AAAA");
            }
            for(int j=0; j < BB; j++)
            {
                sb.append("BB");
            }
        }

        if(err == -1)
            System.out.println(err);
        else
            System.out.println(sb);

    }
}
