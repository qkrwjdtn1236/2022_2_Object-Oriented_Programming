package ch4;

import java.util.Scanner;

public class CH3_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.print("양의 정수를 입력하세요 : ");
            int loop = sc.nextInt();

            if (loop == 999)
                break;

            int sum = 0;
            for(int i = 1;i<=loop;i++)
                sum+=i;

            System.out.printf("1부터 %d까지 합은 %d입니다.\n",loop,sum);
        }
        System.out.println("프로그램을 종료합니다!");
        sc.close();
    }
}
