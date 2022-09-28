package ch4;

import java.util.Scanner;

public class CH3_5 {
    public static void main(String[] args){
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");

        int loop = sc.nextInt();
        sc.close();

        for(int i = 1;i<=loop;i++)
            sum+=i;

        System.out.printf("1부터 %d까지 합은 %d입니다.",loop,sum);
    }
}
