package ch9;

import java.util.ArrayList;
import java.util.Scanner;

public class CH5_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> score = new ArrayList<>();

        int index = 1;
        int data;
        while(true){
            System.out.print(index++ +"원소 입력 : ");
            if((data = in.nextInt())<0) break;
            score.add(data);
        }
        System.out.print("배열 원소 :");
        for(int i : score){
            System.out.printf("%2d",i);
        }
    }
}
