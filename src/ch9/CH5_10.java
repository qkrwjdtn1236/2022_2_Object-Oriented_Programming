package ch9;

import java.util.Scanner;

public class CH5_10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 10개 입력하세요.");
        int[] num = new int[10];
        for(int i = 0;i<num.length;i++)
        {
            num[i] = sc.nextInt();
        }
        graph(num);
    }
    static void graph(int num[]){
        for(int i = 0;i<90;i +=10)
        {
            int cnt = 0;
            for(int j = 0;j<num.length;j++){
                if(num[j] >= i && num[j]<i+10){
                    cnt++;
                }
            }
            System.out.printf("%d ~ %d : ",i,i+9);
            for(int j = 0;j<cnt;j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
