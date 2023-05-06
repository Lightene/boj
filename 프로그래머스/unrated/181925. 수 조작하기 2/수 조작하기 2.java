import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < numLog.length; i++){
            if(numLog[i-1] + 1 == numLog[i]) sb.append("w");
            if(numLog[i-1] - 1 == numLog[i]) sb.append("s");
            if(numLog[i-1] + 10 == numLog[i]) sb.append("d");
            if(numLog[i-1] - 10 == numLog[i]) sb.append("a");
        }
        
        return sb.toString();
    }
}