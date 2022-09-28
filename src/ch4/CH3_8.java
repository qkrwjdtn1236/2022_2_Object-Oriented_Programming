package ch4;

import java.util.Scanner;

public class CH3_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dan;

        System.out.print("출력하고자 하는 구구단 : ");
        while((dan = sc.nextInt())>0){
            for(int i = 1;i<10;i++)
            {
                System.out.printf("%d*%d=%d\n",dan,i,dan*i);
            }
            System.out.print("출력하고자 하는 구구단 : ");
        }
    }
}
