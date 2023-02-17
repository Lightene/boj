package archive.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack {
    int size = 100;
    int top = -1;
    int[] stack;

    void Stack(){
        stack = new int[size];
    }

    void Stack(int size){
        stack = new int[size];
    }

    int push (int n){
        if(top >= size) return  -1;
        top += 1;
        stack[top] = n;
        return stack[top];
    }

    int pop () {
        if(top < 0) return -1;
        int pop_item = stack[top];
        top--;
        return pop_item;
    }

    int empty() {
        if(top < 0) return 1;
        return 0;
    }

    int top () {
        return  stack[top];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack stack = new Stack();


    }
}
