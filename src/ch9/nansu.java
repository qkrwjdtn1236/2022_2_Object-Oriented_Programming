package ch9;

import java.util.Random;
import java.util.Scanner;

public class nansu {
    public static void main(String[] args){

        int com[] = new int[3];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while(com[0] == 0)
            com[0] = r.nextInt(10);
        while(com[1] == com[0] || com[1] == 0)
            com[1] = r.nextInt(10);
        while(com[2] == com[0] || com[2] == com[1] || com[2] == 0)
            com[2] = r.nextInt(10);

        for(int i = 0;i<com.length;i++)
            System.out.printf("com[%d] = %d\n",i,com[i]);
    }
}
